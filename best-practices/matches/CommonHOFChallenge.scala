import scala.util.Random

@main
def commonHigherOrderFunctionsChallenge(): Unit = {
  val numbers = (1 to 20).map(_ => Random.nextInt(100))
  println(numbers)
  val subset = numbers.map { nb =>
    if (nb % 2 == 0)
      nb / 2
    else
      nb * 2
  }.filter(_ > 25)
  println(subset)
}