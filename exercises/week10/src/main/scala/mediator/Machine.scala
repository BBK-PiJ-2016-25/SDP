package mediator

class Machine extends Colleague {
  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = {
    this.mediator = mediator
  }

  def start(): Unit = println("Starting up...")

  def wash(): Unit = mediator.wash()

}