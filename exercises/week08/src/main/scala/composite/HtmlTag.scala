package composite

import java.util.List

abstract class HtmlTag(tagName: String) {
  var startTag:String
  var endTag:String
  var tagBody:String
  def setStartTag(tag: String): Unit = startTag = tag

  def setEndTag(tag: String): Unit = endTag = tag

  def setTagBody(tagBody: String) = this.tagBody = tagBody

  def addChildTag(htmlTag: HtmlTag)

  def removeChildTag(htmlTag: HtmlTag)

  def getChildren: List[HtmlTag]

  def generateHtml
}
