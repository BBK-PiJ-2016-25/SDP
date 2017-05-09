package flyweight

class RubyPlatform extends Platform {

  println("Rubylatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Ruby code.")
}