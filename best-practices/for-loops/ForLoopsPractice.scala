@main
def forLoopsPractice(): Unit = {
  for (x <- 1 to 10)
    println(s"#$x: Hello how are you")

  var total = 0
  for (x <- 1 to 100)
    total += x
  println(s"Total is $total")

  val customers = Map("Alice" -> 4, "Judy" -> 8, "Anna" -> 6)
  for (customerName <- customers.keys)
    val purchases = customers(customerName)
    println(s"$customerName you purchased $purchases items")
}