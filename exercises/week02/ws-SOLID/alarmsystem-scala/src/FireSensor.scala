import scala.util.Random

class FireSensor extends Sensor {

  var location: String = "Bedroom"
  var sensorType: String = "Fire Sensor"
  var batteryPercentage: Double = 100.00

  override def isTriggered: Boolean = {
    if (Random.nextInt(100) < 5) true else false
    batteryPercentage *= 0.9
  }

  override def getLocation: String = location

  override def getSensorType: String = sensorType

  override def getBatteryPercentage: Double = batteryPercentage
}
