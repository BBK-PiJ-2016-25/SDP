package strategy

case class LowerTextFormatter() extends TextFormatter {
  def format(text: String): Unit = println(text.toLowerCase)
}