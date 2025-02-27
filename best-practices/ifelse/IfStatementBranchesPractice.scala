import scala.io.StdIn

@main
def ifStatementBranchesPractice(): Unit = {
//  println("Please enter a number")
//  val number = StdIn.readLine().toInt
//  val message = if (number / 10 == 0) "Single digit number" else "Multiple digit number"
//  println(message)


  println("Please enter a server response code")
  val response = StdIn.readLine()
  val message2 = if (response.startsWith("1"))
    "Information response"
  else if (response.startsWith("2"))
    "Success"
  else if (response.startsWith("3"))
    "Redirect"
  else if (response.startsWith("4"))
    "Client error"
  else
    "Server error"

  println(message2)
}