import scala.io.StdIn

@main
def exceptionExercises(): Unit = {
//  println("Please enter a number")
//  val input = StdIn.readLine()
//
//  try {
//    val number = input.toInt
//    println(s"$number * 5 = ${number * 5}")
//  } catch {
//    case e: NumberFormatException => {
//      println(s"The value '$input' is not a number")
//      e.printStackTrace()
//    }
//  }

  println("Please enter the distance you ran in km")
  val input = StdIn.readLine()

  try {
    val distanceKm = input.toDouble
    val distanceMiles = distanceKm * .62
    println(s"Distance $distanceKm km is $distanceMiles miles")
  } catch {
    case e: NumberFormatException => {
      println("Cannot read distance")
      e.printStackTrace()
    }
  }
}