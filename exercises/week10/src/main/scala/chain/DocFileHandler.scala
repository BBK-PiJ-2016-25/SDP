package chain

case class DocFileHandler(s: String) extends Handler {
  var handler: Handler = _
  override def setHandler(handler: Handler): Unit = this.handler = handler

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else if (file.fileType.equals("doc")) {
      println("Process and saving doc file.. by Doc File Handler")
    } else {
      println(this.getHandlerName() + " forwards request to " + handler.getHandlerName())
      handler.process(file)
    }
  }

  override def getHandlerName(): String = "Doc File Handler"

}
