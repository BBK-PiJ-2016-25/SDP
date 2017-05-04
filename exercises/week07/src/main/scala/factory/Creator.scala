package factory

trait Creator {
  def create(a:Any):Product
}