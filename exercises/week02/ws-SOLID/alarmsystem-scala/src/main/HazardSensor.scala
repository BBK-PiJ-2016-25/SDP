package main
/**
  * Created by anniehawes on 16/02/2017.
  */
trait HazardSensor extends Sensor {
  var category = "Hazard"
  def getBatteryPercentage: Double
}
