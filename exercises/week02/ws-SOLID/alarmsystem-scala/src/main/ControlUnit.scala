package main

// import org.springframework.context.support.ClassPathXmlApplicationContext

import scala.collection.mutable.ListBuffer

class ControlUnit {
  def pollSensors() {
    //val factory = new ClassPathXmlApplicationContext("dixmlcons.xml")

    // val sensors = new ListBuffer[Sensor]()
    val sensors = new ListBuffer[Sensor]
    sensors += new FireSensor()
    // sensors += factory.getBean("firstSensor").asInstanceOf[Sensor]
    sensors += new SmokeSensor()
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

object ControlUnit
