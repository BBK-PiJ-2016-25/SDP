package abstractfactory

case class NYCFactory() extends AbstractParserFactory {
  override def getParserInstance(parserType: String):XMLParser = {
    parserType match {
      case "NYCORDER" => NYCOrderXMLParser()
      case "NYCERROR" => NYCErrorXMLParser()
      case "NYCFEEDBACK" => NYCFeedbackXMLParser()
      case "NYCRESPONSE" => NYCResponseXMLParser()
      case _ => throw new Exception("Invalid Parser name provided")
    }
  }
}

case class LondonFactory() extends AbstractParserFactory {
  override def getParserInstance(parserType: String):XMLParser = {
    parserType match {
      case "LondonORDER" => LondonOrderXMLParser()
      case "LondonERROR" => LondonErrorXMLParser()
      case "LondonFEEDBACK" => LondonFeedbackXMLParser()
      case "LondonRESPONSE" => LondonResponseXMLParser()
      case _ => throw new Exception("Invalid Parser name provided")
    }
  }
}