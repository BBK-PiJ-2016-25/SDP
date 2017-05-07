package strategy

case class CapTextFormatter() extends TextFormatter {
  def format(text: String): Unit = println(text.toUpperCase)
}