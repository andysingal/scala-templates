@main
def lambdasPractice(): Unit = {
  val numbers = Array[Double](2, 8, 5, 76, 3, 4, 7, 0, 38)
  println(numbers.toList)
  val newNumbers = update(numbers, (number: Double) => number / 10)
  println(newNumbers.toList)
}

def update(numbers: Array[Double], lbd: Double => Double): Array[Double] =
  for (i <- numbers.indices)
    if (numbers(i) % 2 == 0)
      numbers(i) = lbd(numbers(i))
  numbers