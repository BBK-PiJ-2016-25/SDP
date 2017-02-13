package decoupled

/**
  * Created by anniehawes on 12/02/2017.
  */
class StandardOutMessageRenderer {
  private var messageProvider: HelloWorldMessageProvider = null

  def render: Unit = {
    if (messageProvider == null) {
      throw new RuntimeException("You must set the property messageProvider of class: "
        + classOf[StandardOutMessageRenderer].getName)
    }
    println(messageProvider.getMessage)
  }

  def getMessageProvider: HelloWorldMessageProvider = messageProvider

  def setMessageProvider(provider: HelloWorldMessageProvider): Unit = messageProvider = provider

}
