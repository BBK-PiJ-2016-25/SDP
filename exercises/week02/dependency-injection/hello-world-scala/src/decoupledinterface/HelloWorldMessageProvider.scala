package decoupledinterface

/**
  * Created by anniehawes on 13/02/2017.
  */
class HelloWorldMessageProvider extends MessageProvider {
  override def getMessage: String = "Hello World!"
}
