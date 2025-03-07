@main
def commonHigherOrderFunctions(): Unit = {
  val clients = List("Carol", "David", "Anna", "Bob")
  clients.foreach { client =>
    println(s"Hello $client")
  }

//  clients.filter(_.length <= 4).foreach(println)
  println(clients.filter(_.length <= 4))

  val sizes = clients.map(_.length)
  println(sizes)

  val sorted = clients.sortBy(_.length)
  println(sorted)

  val max = clients.maxBy(_.length)
  println(max)

  val min = clients.minBy(_.length)
  println(min)
}