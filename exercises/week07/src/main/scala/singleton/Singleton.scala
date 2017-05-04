package singleton

class Singleton private(var state : Int) {
}

object Singleton {
  private val _instance = new Singleton(0)
  def instance() =
    _instance
}