package factory

object ConcreteCreator extends Creator {
  implicit def create(a:Any):Product = a match {
    case name:String => ConcreteProduct(name)
  }
}