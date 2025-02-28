import scala.io.StdIn

@main
def moreForLoopsChallenge(): Unit = {
  println("Please enter the matrix size")
  val size = StdIn.readLine().toInt

  for (i <- 1 to size)
    for (j <- 1 to size)
      (i + j) % 3 match
        case 0 => print("\uD83D\uDE00\t")
        case 1 => print("\uD83E\uDD28\t")
        case 2 => print("\uD83D\uDE31\t")
    println()
}