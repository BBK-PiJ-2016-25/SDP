package classes

case class Person(firstName: String, lastName: String)

object Person {
  def apply(fullName: String) = new Person(fullName.split(" ")(0),fullName.split(" ")(1))
}