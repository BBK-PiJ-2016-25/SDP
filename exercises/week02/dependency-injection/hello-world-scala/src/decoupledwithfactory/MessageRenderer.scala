package decoupledwithfactory

/**
  * Created by anniehawes on 13/02/2017.
  */
trait MessageRenderer {
  def render

  def setMessageProvider(provider: MessageProvider)

  def getMessageProvider: MessageProvider
}
