package main

/**
  * Created by anniehawes on 13/02/2017.
  */
trait Sensor {
  def isTriggered: Boolean

  def getLocation: String

  def getSensorType: String
}
