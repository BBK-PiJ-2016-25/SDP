package chain

case class ExcelFileHandler(s: String) extends Handler {
  var handler: Handler = _
  override def setHandler(handler: Handler): Unit = this.handler = handler

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else if (file.fileType.equals("excel")) {
      println("Process and saving excel file.. by Excel File Handler")
    } else {
      println(this.getHandlerName() + " forwards request to " + handler.getHandlerName())
      handler.process(file)
    }
  }

  override def getHandlerName(): String = "Excel File Handler"
}