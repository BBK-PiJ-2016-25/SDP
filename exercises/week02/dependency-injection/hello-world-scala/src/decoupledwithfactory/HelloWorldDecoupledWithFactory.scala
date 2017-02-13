package decoupledwithfactory

/**
  * Created by anniehawes on 13/02/2017.
  */
object HelloWorldDecoupledWithFactory extends App {
  val mr: MessageRenderer = MessageSupportFactory.getInstance.getMessageRenderer
  val mp: MessageProvider = MessageSupportFactory.getInstance.getMessageProvider
  mr.setMessageProvider(mp)
  mr.render
}
