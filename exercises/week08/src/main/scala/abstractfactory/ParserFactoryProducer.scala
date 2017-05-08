package abstractfactory

import com.sun.javaws.exceptions.InvalidArgumentException

object ParserFactoryProducer {
  def getFactory(s: String) = {
    s match {
      case "NYCFactory" => NYCFactory()
      case "LondonFactory" => LondonFactory()
      case _ => throw new Exception("Invalid factory name provided")
    }
  }

}