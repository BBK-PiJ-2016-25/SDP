package chain

case class AudioFileHandler(s: String) extends Handler {
  var handler: Handler = _
  override def setHandler(handler: Handler): Unit = this.handler = handler

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else if (file.fileType.equals("audio")) {
      println("Process and saving audio file.. by Audio File Handler")
    } else {
      println(this.getHandlerName() + " forwards request to " + handler.getHandlerName())
      handler.process(file)
    }
  }

  override def getHandlerName(): String = "Audio File Handler"
}