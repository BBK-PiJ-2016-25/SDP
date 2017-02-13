package decoupled

/**
  * Created by anniehawes on 12/02/2017.
  */
object HelloWorldDecoupled extends App{
  val mr: StandardOutMessageRenderer = new StandardOutMessageRenderer
  val mp: HelloWorldMessageProvider = new HelloWorldMessageProvider
  mr.setMessageProvider(mp)
  mr.render
}
