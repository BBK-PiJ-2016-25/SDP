package strategy

case class TextEditor(textFormatter: TextFormatter) {
  def publishText(text:String) = textFormatter.format(text)
}