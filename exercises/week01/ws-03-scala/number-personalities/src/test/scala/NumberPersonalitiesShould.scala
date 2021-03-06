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

  // isTriangular tests

  test("isTriangular- 0") {
    assert(isTriangular(0))
  }

  test("isTriangular- 1") {
    assert(isTriangular(1))
  }

  test("isTriangular- 11") {
    assert(!isTriangular(11))
  }

  test("isTriangular- 36") {
    assert(isTriangular(36))
  }

  test("isTriangular- 100") {
    assert(!isTriangular(100))
  }

  test("isTriangular- 351") {
    assert(isTriangular(351))
  }

  // isSquare tests

  test("isSquare- 1") {
    assert(isSquare(1))
  }

  test("isSquare- 2") {
    assert(!isSquare(2))
  }

  test("isSquare- 10") {
    assert(!isSquare(10))
  }

  test("isSquare- 16") {
    assert(isSquare(16))
  }

  test("isSquare- 99") {
    assert(!isSquare(99))
  }

  test("isSquare- 144") {
    assert(isSquare(144))
  }

  // isSmug tests

  test("isSmug -1") {
    assert(!isSmug(1))
  }

  test("isSmug- 2") {
    assert(isSmug(2))
  }

  test("isSmug- 11") {
    assert(!isSmug(11))
  }

  test("isSmug- 109") {
    assert(isSmug(109))
  }

  test("isSmug- 28") {
    assert(!isSmug(28))
  }

  // isHonest tests

  test("isHonest -1") {
    assert(isHonest(1))
  }

  test("isHonest- 2") {
    assert(isHonest(2))
  }

  test("isHonest- 3") {
    assert(isHonest(3))
  }

  test("isHonest- 4") {
    assert(isHonest(4))
  }

  test("isHonest- 5") {
    assert(!isHonest(5))
  }

  test("isHonest- 6") {
    assert(isHonest(6))
  }

  // isPronic tests

  test("isPronic -12") {
    assert(isPronic(12))
  }

  test("isPronic- 20") {
    assert(isPronic(20))
  }

  test("isPronic- 1") {
    assert(!isPronic(1))
  }

  test("isPronic- 2") {
    assert(isPronic(2))
  }

  test("isPronic- 15") {
    assert(!isPronic(15))
  }

  test("isPronic- 6") {
    assert(isHonest(6))
  }

  test("isPronic- 18") {
    assert(!isPronic(18))
  }

  // sumOfDivisors tests

  test("sumOfDivisors -24") {
    assert(sumOfDivisors(24) == 36)
  }

}
