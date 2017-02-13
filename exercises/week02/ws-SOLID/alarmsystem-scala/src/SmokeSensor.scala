import scala.util.Random

class SmokeSensor extends Sensor {

  var location: String = "Kitchen"
  var sensorType: String = "Smoke Sensor"
  var batteryPercentage: Double = 100.00

  override def isTriggered: Boolean = {
    if (Random.nextInt(100) < 10) true else false
    batteryPercentage *= 0.8
  }

  override def getLocation: String = location

  override def getSensorType: String = sensorType

  override def getBatteryPercentage: Double = batteryPercentage
}
