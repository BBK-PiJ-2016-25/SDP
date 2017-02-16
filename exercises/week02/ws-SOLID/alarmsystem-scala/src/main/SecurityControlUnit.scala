package main

import java.util.Calendar

import org.springframework.context.support.ClassPathXmlApplicationContext

import scala.collection.mutable.ListBuffer

/**
  * Created by anniehawes on 16/02/2017.
  */
class SecurityControlUnit extends ControlUnit {

  var allSensorsToBePolled: ListBuffer[Sensor] = new ListBuffer[Sensor]()
  var nonSecuritySensorsToBePolled: ListBuffer[Sensor]  = new ListBuffer[Sensor]()

  def populateVariables: Unit = {
    val factory = new ClassPathXmlApplicationContext("dixmlcons.xml")
    for (bean<- factory.getBeanDefinitionNames()) {
      allSensorsToBePolled += factory.getBean(bean).asInstanceOf[Sensor]
    }

    for (bean<- factory.getBeanDefinitionNames()) {
      if (!factory.getBean(bean).isInstanceOf[SecuritySensor]) {
        nonSecuritySensorsToBePolled += factory.getBean(bean).asInstanceOf[Sensor]
      }
    }
  }

  def pollSensors() : Unit ={
    this.populateVariables
    val currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    if (currentTime >= 23 || currentTime < 6) {
      super.pollSensors(allSensorsToBePolled)
    } else {
      println("Security Sensors not triggered")
      super.pollSensors(nonSecuritySensorsToBePolled)
    }
  }

}
