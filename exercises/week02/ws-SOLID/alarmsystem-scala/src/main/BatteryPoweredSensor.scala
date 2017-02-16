package main
/**
  * Created by anniehawes on 16/02/2017.
  */
trait BatteryPoweredSensor extends Sensor {
  override def isBatteryPowered: Boolean = true
  def getBatteryPercentage: Double
}
