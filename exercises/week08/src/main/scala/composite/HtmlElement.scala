package composite

import java.util.List

case class HtmlElement(s: String) extends HtmlTag(s) {
  var startTag:String = _
  var endTag:String = _
  var tagBody:String = _
  def addChildTag(htmlTag: HtmlTag) ={}

  def removeChildTag(htmlTag: HtmlTag) ={}

  def getChildren: List[HtmlTag] = null

  override def generateHtml: Unit = {
    println(startTag + tagBody + endTag)
  }
}