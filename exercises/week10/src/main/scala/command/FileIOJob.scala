package command

class FileIOJob extends Job {
  var fileIO: FileIO =_
  def setFileIO(fileIO: FileIO): Unit = this.fileIO = fileIO

  override def run(): Unit = fileIO.execute()
}