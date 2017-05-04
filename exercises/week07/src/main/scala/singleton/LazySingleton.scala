package singleton

/**
  * Created by anniehawes on 04/05/2017.
  */
class LazySingleton private(var state : Int)

object LazySingleton {
  private var _instance : LazySingleton = null
  def instance() = {
    if (_instance == null)
      _instance = new LazySingleton(0)
    _instance
  }
}