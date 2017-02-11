/**
  * Created by ahawes02 on 09/02/2017.
  */
object  NumberPersonalities {

  val limit = 100

  def isPrime(n: Int): Boolean = n > 1 && !((2 until n / 2) exists (n % _ == 0))

  def sumOfSquares(n: Int): Int = {
    val digitsList = n.toString.map(_.asDigit).toList
    digitsList map (a => a * a) sum
  }

  def isHappy(n: Int): Boolean = {
    if (n == 1) true else if (n == 4) false else isHappy(sumOfSquares(n))
  }

  def isTriangular(n: Int): Boolean = {
    var input = n
    var counter = 1
    while (input > 0) {
      input-= counter
      counter+= 1
    }
    if (input == 0) true else false
  }

  def isSquare(n: Int): Boolean = {
    var input = n
    var counter = 1
    while (input > 0) {
      input-= counter
      counter+= 2
    }
    if (input == 0) true else false
  }

  def isSmug(n: Int): Boolean = {
    var remainder = 0
    println("number is " + n)
    var counter = 1
    do {
      remainder = n - counter * counter
      counter += 1
    } while (!isSquare(remainder) && remainder > 0)
    println("remainder is " + remainder)
    if (remainder != 0 && isSquare(remainder)) true else false
  }
  //def isHonest(n: Int): Boolean
  //def isPronic(n: Int): Boolean
  //def isDeficient(n: Int): Boolean
  //def isPerfect(n: Int): Boolean
  //def isAbundant(n: Int): Boolean

  /*
  def main(args: Array[String]): Unit = {
    for(a<-1 until limit) {
    }
  }
  */
}
