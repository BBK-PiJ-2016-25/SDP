package main
/**
  * Created by anniehawes on 16/02/2017.
  */
trait SecuritySensor extends Sensor {
  override def isBatteryPowered: Boolean = false
}
