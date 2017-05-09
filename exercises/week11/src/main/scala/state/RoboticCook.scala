package state

case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticOn
    println("Walking...")
  }
  def cook(): Unit = println("Cooking...")
  def off(): Unit = println("Cannot cook at Off state")
}
