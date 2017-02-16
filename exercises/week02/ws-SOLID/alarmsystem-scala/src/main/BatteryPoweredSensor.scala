package main
/**
  * Created by anniehawes on 16/02/2017.
  */
trait BatteryPoweredSensor extends Sensor {
  def getBatteryPercentage: Double
}
