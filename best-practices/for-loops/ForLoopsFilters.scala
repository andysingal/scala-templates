@main
def forLoopFilters(): Unit = {
  val clients = List("Alice", "Bob", "Carol", "Britney", "Tom")
  for (client <- clients if client.length > 4)
    println(s"Hello $client")

  println()

  for (client <- clients if client.length > 4; if client.toLowerCase.contains("a"))
    println(s"Hello $client")

  val output = for (client <- clients if client.length > 4)
    yield client
  println(output)
}