import scala.io.StdIn
import scala.util.Random

@main
def patternMatching(): Unit = {
  println("Type an animal")
  val input = StdIn.readLine()

  var action = ""
  input match
    case "dog" => action = "pet it"
    case "cat" => action = "feed it"
    case "crocodile" => action = "run away"
    case _ => action = "google it"

  println(s"When you see a $input you $action")

  val number = Random.nextInt(100)
  println(number)
  number % 2 match
    case 0 => println("Number is even")
    case 1 => println("Number is odd")

}