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
    if (n == 1) {
      true
    } else if (n == 4) {
      false
    } else {
      isHappy(sumOfSquares(n))
    }
  }

  //def isTriangular(n: Int): Boolean
  //def isSquare(n: Int): Boolean
  //def isSmug(n: Int): Boolean
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
