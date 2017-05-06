package adapter

class XPayToPayDAdapter extends PayD {

  val adaptee: XpayImpl

  def getCustCardNo: String = adaptee.getCreditCardNo

  def setCustCardNo(custCardNo: String) = adaptee.setCreditCardNo(custCardNo)

  def getCardOwnerName: String = adaptee.getCustomerName

  def setCardOwnerName(cardOwnerName: String) = adaptee.getCustomerName

  def getCardExpMonthDate: String = adaptee.getCardExpMonth

  def setCardExpMonthDate(cardExpMonthDate: String) = adaptee.setCardExpMonth(cardExpMonthDate)

  def getCVVNo: Integer = adaptee.getCardCVVNo.toInt

  def setCVVNo(cVVNo: Integer) = adaptee.setCardCVVNo(cVVNo.toShort)

  def getTotalAmount: Double = adaptee.getAmount

  def setTotalAmount(totalAmount: Double) = adaptee.setAmount(totalAmount)

}
