@main
def functionReturn(): Unit = {
  val r = 64
  val area = calculateCircleArea(r)
  println(s"A circle with the radius of $r has an area of $area")

  val clients = List("Anna", "Bob", "William")
  for (client <- clients)
    val greeting = personalisedGreeting(client)
    println(greeting)
}

//def calculateCircleArea(radius: Int): Double = {
//  val pi = 3.14159
//  pi * radius * radius
//}

def calculateCircleArea(radius: Int) = 3.14159 * radius * radius

def personalisedGreeting(person: String): String = {
  person(0) match
    case 'A' => s"Are you ok $person"
    case 'W' => s"What's up $person"
    case _ => s"Hi $person"
}