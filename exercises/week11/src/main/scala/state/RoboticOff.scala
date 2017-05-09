package state

case class RoboticOff(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticOn
    println("Walking...")
  }
  def cook(): Unit = println("Robot cannot cook in an Off state")
  def off(): Unit = {
    r.state = r.roboticOff
    println("Robot is switched off")
  }
}
