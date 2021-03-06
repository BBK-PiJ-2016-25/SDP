package main

import scala.collection.mutable.ListBuffer

class ControlUnit {
  def pollSensors(sensors:ListBuffer[Sensor]) {
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
        sensor.notification.announce
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

object ControlUnit
