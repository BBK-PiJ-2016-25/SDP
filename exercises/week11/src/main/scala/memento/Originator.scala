package memento

case class Originator(
                       var x: Double,
                       var y: Double,
                       var careTaker: CareTaker
                     ) {

  private var lastUndoSavepoint: String = _
  private var currentState: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    println("Saving state..." + savepointName)
    lastUndoSavepoint = savepointName
  }

  def undo(): Unit = {
    println("Undo at..." + lastUndoSavepoint)
    currentState = lastUndoSavepoint
  }

  def undo(savepointName: String): Unit = {
    println("Undo at..." + savepointName)
    currentState = savepointName
  }

  def undoAll(): Unit = {
    println("Undo at... INITIAL")

    currentState = "INITIAL"
  }

  private def setOriginatorState(savepointName: String): Unit = currentState = savepointName

  override def toString(): String = "X: " + x + ", Y: " + y
}