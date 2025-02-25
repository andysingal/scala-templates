import scala.io.StdIn

@main
def exceptionsChallenge(): Unit = {
  println("What product would you like to buy?")
  val product = StdIn.readLine()

  println("How many would you like?")
  val input = StdIn.readLine()

  val price = 9.99

  try {
    val amount = input.toInt
    println(s"$amount $product will cost ${amount * price}")
  } catch {
    case e: NumberFormatException => {
      println("Cannot read amount")
      e.printStackTrace()
    }
  } finally {
    println("Transaction completed")
  }
}