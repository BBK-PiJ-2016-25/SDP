package abstractfactory

case class NYCOrderXMLParser() extends XMLParser {
  override def parse: String = "NYC Parsing order XML... \n NYC Order XML Message"
}

case class NYCErrorXMLParser() extends XMLParser {
  override def parse: String = "NYC Parsing error XML... \n NYC Error XML Message"
}

case class NYCFeedbackXMLParser() extends XMLParser {
  override def parse: String = "NYC Parsing feedback XML... \n NYC Feedback XML Message"
}

case class NYCResponseXMLParser() extends XMLParser {
  override def parse: String = "NYC Parsing response XML... \n NYC Response XML Message"
}

case class LondonOrderXMLParser() extends XMLParser {
  override def parse: String = "London Parsing order XML... \n London Order XML Message"
}

case class LondonErrorXMLParser() extends XMLParser {
  override def parse: String = "London Parsing error XML... \n London Error XML Message"
}

case class LondonFeedbackXMLParser() extends XMLParser {
  override def parse: String = "London Parsing feedback XML... \n London Feedback XML Message"
}

case class LondonResponseXMLParser() extends XMLParser {
  override def parse: String = "London Parsing response XML... \n London Response XML Message"
}