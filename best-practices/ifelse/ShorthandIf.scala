import scala.io.StdIn

@main
def shorthandIf(): Unit = {
  println("Please enter a number")
  val number = StdIn.readLine().toInt
  var isEven: String = null

  isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

  isEven = if (number % 2 == 0)
    println("true value")
    "Number is even"
  else
    println("false value")
    "Number is odd"

  println(isEven)
}