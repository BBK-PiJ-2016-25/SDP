package prototype

class User(var userName: String,
           var level: String,
           var accessControl: AccessControl) {

  override def toString() = "Name: " + userName + ", Level: " + level + " Level, Access Control Level: " + level + ", Access: " + accessControl.access
}