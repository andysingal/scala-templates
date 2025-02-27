import scala.io.StdIn

@main
def rangeChallenge(): Unit = {
  println("Please enter what month you would like to see (1-12)")
  var month = StdIn.readLine().toInt
  if (month < 1 || month > 12)
    month = 1
  val waterFrequency = 3

  val days = if (month == 2)
    28
  else if (List(4, 6, 9, 11).contains(month))
    30
  else
    31

  println((1 to days by waterFrequency).toList)
}