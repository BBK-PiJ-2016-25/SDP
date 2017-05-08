package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    return this.getClass.getName
  }

  def getPrice: Double = {
    return 0
  }
}