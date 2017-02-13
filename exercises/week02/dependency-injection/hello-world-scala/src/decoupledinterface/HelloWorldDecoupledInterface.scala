package decoupledinterface

/**
  * Created by anniehawes on 13/02/2017.
  */
object HelloWorldDecoupledInterface extends App {
  val mr: MessageRenderer = new StandardOutMessageRenderer
  val mp: MessageProvider = new HelloWorldMessageProvider
  mr.setMessageProvider(mp)
  mr.render
}
