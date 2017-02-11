import NumberPersonalities._
class NumberPersonalitiesShould extends org.scalatest.FunSuite {

  // isPrime tests

  test("isPrime - 0") {
    assert(!isPrime(0))
  }

  test("isPrime - 1") {
    assert(!isPrime(1))
  }

  test("isPrime - 2") {
    assert(isPrime(2))
  }

  test("isPrime - 21") {
    assert(!isPrime(21))
  }

  test("isPrime - 43") {
    assert(isPrime(43))
  }

  // isHappy tests

  test("sumOfSquares- 563") {
    assert(sumOfSquares(563) == 70)
  }

  test("isHappy- 1") {
    assert(isHappy(1))
  }

  test("isHappy- 19") {
    assert(isHappy(19))
  }

  test("isHappy- 4") {
    assert(!isHappy(4))
  }

  test("isHappy- 150") {
    assert(!isHappy(150))
  }

  test("isHappy- 565") {
    assert(isHappy(565))
  }

}
