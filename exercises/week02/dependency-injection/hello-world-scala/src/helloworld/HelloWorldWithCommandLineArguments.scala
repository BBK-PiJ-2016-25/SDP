package helloworld

/**
  * Created by anniehawes on 12/02/2017.
  */
object HelloWorldWithCommandLineArguments extends App{
    if (args.length > 0) {
      args.foreach(arg => print(arg + " "))
    }
    else {
      print("Hello World!")
    }
    println()
}
