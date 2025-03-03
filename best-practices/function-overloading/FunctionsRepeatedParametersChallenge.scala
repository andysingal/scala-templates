@main
def functionsRepeatedParametersChallenge(): Unit = {
  printHello(5, "Mary", "John", "Alex", "Michelle")
}

def printHello(count: Int, names: String*): Unit =
  for (name <- names)
    for (i <- 1 to count)
      print(s"Hello $name - ")
    println()