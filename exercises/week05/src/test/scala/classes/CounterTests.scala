package classes

import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by anniehawes on 25/04/2017.
  */
class CounterTests  extends FunSuite with BeforeAndAfter {

  var counter: Counter = _
  var counterFromTen: Counter = _
  var adder: Adder = _

  before {
    counter = new Counter()
    counterFromTen = new Counter(10)
    adder = new Adder(50)
  }

  test("new counter starts at 0 when no argument is provided to the constructor") {
    assert(counter.count == 0)
  }

  test("new counter starts at the value of the argument provided to the constructor") {
    assert(counterFromTen.count == 10)
  }

  test("counter decrements by 1 when no argument is provided") {
    counterFromTen.dec()
    assert(counterFromTen.count == 9)
  }

  test("counter decrements by the value of the argument provided") {
    counterFromTen.dec(5)
    assert(counterFromTen.count == 5)
  }

  test("counter increments by 1 when no argument is provided") {
    counterFromTen.inc()
    assert(counterFromTen.count == 11)
  }

  test("counter increments by the value of the argument provided") {
    counterFromTen.inc(5)
    assert(counterFromTen.count == 15)
  }

  test("adjust generates new adder adjusted by the value of the adder from the original") {
    assert(counter.adjust(adder).count == 50)
  }

}
