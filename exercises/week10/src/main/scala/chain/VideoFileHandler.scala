package chain

case class VideoFileHandler(s: String) extends Handler {
  var handler: Handler = _
  override def setHandler(handler: Handler): Unit = this.handler = handler

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else if (file.fileType.equals("video")) {
      println("Process and saving video file.. by Video File Handler")
    } else {
      println(this.getHandlerName() + " forwards request to " + handler.getHandlerName())
      handler.process(file)
    }
  }

  override def getHandlerName(): String = "Video File Handler"
}