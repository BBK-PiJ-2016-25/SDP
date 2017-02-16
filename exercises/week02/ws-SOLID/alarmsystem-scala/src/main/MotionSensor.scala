package main

import scala.util.Random

/**
  * Created by anniehawes on 16/02/2017.
  */
class MotionSensor extends Sensor {

  var location: String = "Hallway"
  var sensorType: String = "Motion Sensor"

  override def isTriggered: Boolean = {
    if (Random.nextInt(100) < 50) true else false
  }

  override def getLocation: String = location

  override def getSensorType: String = sensorType

}