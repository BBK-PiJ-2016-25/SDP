package composite

import java.util.ArrayList
import java.util.List

case class HtmlParentElement(s: String) extends HtmlTag(s) {
  var startTag:String = _
  var endTag:String = _
  var tagBody:String = _
  var children:List[HtmlTag] = new ArrayList[HtmlTag]()

  override def addChildTag(htmlTag: HtmlTag) = children.add(htmlTag)

  override def removeChildTag(htmlTag: HtmlTag) = children.remove(htmlTag)

  override def getChildren: List[HtmlTag] = children

  override def generateHtml: Unit = {
    println(startTag + tagBody + children.forEach(a => a.generateHtml) + endTag)
  }
}
