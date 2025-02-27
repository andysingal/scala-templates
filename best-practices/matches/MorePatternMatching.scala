import scala.io.StdIn

@main
def morePatternMatching(): Unit = {
//  println("Type an animal")
//  val input = StdIn.readLine()
//
//  val action = input match
//    case "dog" | "hamster" | "rabbit" => "pet it"
//    case "cat" => "feed it"
//    case "crocodile" => "run away"
//    case _ => "google it"
//
//  println(action)

  val numbers = List(1, 2, 3)
  numbers match
    case List(1, 2, 3) => println("single digits")
    case List(10, 11, 12) => println("double digits")
    case _ => println("Unknown")

  val animalFeed = ("cats", "catFood")
  animalFeed match
    case ("cat", _) => println("cat info")
    case ("dog", _) => println("dog info")
    case _ => println("random tuple")
}