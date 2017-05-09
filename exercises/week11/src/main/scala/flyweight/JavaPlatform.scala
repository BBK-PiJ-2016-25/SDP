package flyweight

class JavaPlatform extends Platform {

  println("JavaPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Java code.")
}