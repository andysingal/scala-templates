import scala.io.StdIn

@main
def functionsLocalChallenge(): Unit = {
  printGreeting()
}

def printGreeting(): Unit =
  def sayHi(name: String) = println(s"Hi $name how are you")

  var currentName = "abc"
  while (!currentName.isEmpty)
    println("Please enter a name")
    currentName = StdIn.readLine()
    if (currentName.isEmpty)
      println("Finishing execution")
    else
      sayHi(currentName)