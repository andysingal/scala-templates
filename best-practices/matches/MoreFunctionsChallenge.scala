import scala.io.StdIn

@main
def moreFunctionsChallenge(): Unit = {
  println("Please enter an animal")
  val animal = StdIn.readLine()
  val lifespan = getLifespan(animal)
  println(s"A $animal has a lifespan of $lifespan years")
}

def getLifespan(name: String) =
  name match
    case "cat" => 15
    case "dog" => 10
    case "rabbit" => 12
    case _ => 20