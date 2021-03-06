package main

import scala.util.Random

class FireSensor(notificationMethod: INotification) extends HazardSensor {

  var location: String = "Bedroom"
  var sensorType: String = "Fire Sensor"
  var batteryPercentage: Double = 100.00

  override def isTriggered: Boolean = {
    batteryPercentage *= 0.9
    if (Random.nextInt(100) < 5) true else false
  }

  override def getLocation: String = location

  override def getSensorType: String = sensorType

  override def getBatteryPercentage: Double = batteryPercentage

  override def notification = notificationMethod
}
