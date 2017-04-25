package classes

/**
  * Created by anniehawes on 25/04/2017.
  */

case class Counter(var count:Int=0) {

  def inc(step:Int=1): Counter = {
    count += step
    this
  }

  def dec(step:Int=1): Counter = {
    count -= step
    this
  }

  def adjust(adder:Adder):Counter = {
    Counter(adder.add(count))
   }
}