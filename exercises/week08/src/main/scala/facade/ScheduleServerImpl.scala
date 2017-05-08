package facade

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = {
    println("System booting up...")
  }

  override def readSystemConfigFile: Unit = {
    println("Reading system configuration file...")
  }

  override def init: Unit = {
    println("Initializing...")
  }

  override def initializeContext: Unit = {
    println("Initializing context...")
  }

  override def initializeListeners: Unit = {
    println("Initializing listeners...")
  }

  override def createSystemObjects: Unit = {
    println("Creating system objects...")
  }

  override def releaseProcesses: Unit = {
    println("Releasing processes...")
  }

  override def destory: Unit = {
    println("Destroying...")
  }

  override def destroySystemObjects: Unit = {
    println("Destroying system objects...")
  }

  override def destoryListeners: Unit = {
    println("Destroying listeners...")
  }

  override def destoryContext: Unit = {
    println("Destroying context...")
  }

  override def shutdown: Unit = {
    println("Shutting down...")
  }
}