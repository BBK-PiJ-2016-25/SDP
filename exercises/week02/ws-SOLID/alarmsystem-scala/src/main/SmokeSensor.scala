package main

import scala.util.Random

class SmokeSensor extends Sensor {

  var location: String = "Kitchen"
  var sensorType: String = "Smoke main.Sensor"
  var batteryPercentage: Double = 100.00

  override def isTriggered: Boolean = {
    batteryPercentage *= 0.8
    if (Random.nextInt(100) < 10) true else false
  }

  override def getLocation: String = location

  override def getSensorType: String = sensorType

  override def getBatteryPercentage: Double = batteryPercentage
}
