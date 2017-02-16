package main
/**
  * Created by anniehawes on 16/02/2017.
  */
class TriggerContacts extends INotification {
  override def announce: Unit = {
    println("Calling 999...")
    println("Calling owner's phone")
  }
}
