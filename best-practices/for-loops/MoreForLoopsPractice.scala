import scala.io.StdIn

@main
def moreForLoopsPractice(): Unit = {
//  println("Please enter a number")
//  val maxValue = StdIn.readLine().toInt
//  for (i <- maxValue to 0 by -1 if i % 7 == 0)
//    print(s"$i\t")
//  println()

  for (i <- 1 to 10)
    for (j <- 1 to i)
      print("\uD83D\uDE00")
    println()
}