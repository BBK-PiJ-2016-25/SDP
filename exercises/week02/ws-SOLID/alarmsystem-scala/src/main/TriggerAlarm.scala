package main
/**
  * Created by anniehawes on 16/02/2017.
  */
class TriggerAlarm extends INotification{
  override def announce: Unit = {
    println("Alarm activated!")
  }
}