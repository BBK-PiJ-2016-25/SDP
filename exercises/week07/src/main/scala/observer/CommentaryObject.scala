package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {
  def subscribeObserver(observer: Observer) = subscribers = subscribers += observer

  def unSubscribeObserver(observer: Observer) = subscribers = subscribers.filter(_ == observer)

  def notifyObservers() = subscribers.foreach(a => a.update(subjectDetails))

  def subjectDetails: String = title
}
