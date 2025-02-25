# scala-templates

![Screenshot 2024-12-31 125921](https://github.com/user-attachments/assets/06d24cdb-f649-4497-985b-7ea79b540eb1)

```scala

object hello {
   def main(args: Array[String]) = print("hello")
}

```

```scala
def stringFunctions(): Unit = {
  val myPet = "Crocodile"
  println(myPet.length)

  val myAnimal = "GirAfFe"
  println(myAnimal.toLowerCase)
  println(myAnimal.toUpperCase)

  val myText = " there are too many spaces "
  println(myText.trim)

  println(myText.trim.substring(3,6).charAt(0))

  val apples = 3
  val oranges = 6
  println(s"We have ${apples + oranges} fruit")

}

```

  ```scala

import scala.io.StdIn
@main
def numberExercises(): Unit = {
   val var1 = 45

   println(var1.getClass)

   println("Please enter a number")
   val input = StdIn.readLine()
   val number = input.toInt
   val multiplier = 2.75
   val result = number * multiplier
   println(result.getClass)


   println("Please enter the amount in your account: ")

   //val input = StdIn.readLine()
   //val amount = input.toDouble
   //val amountAfter5Years = amount * 1.055 * 1.055
   //println(s"You will have $$$amountAfter5Years")
   
}
```


```scala
val test = StdIn.readLine()
try {
   println(test.toInt)
} catch {
  case f: NumberFormatException => {
  println("Illegal state Exception occured")
  f.printStackTrace()
} 
  case e: Exception => {
println("Exception occured")
}
}
```

```scala
try {
   // try do something
} catch {
 case e: Exception => //if exception1 occurs, do this
case e: Exception 2 => //if exception2 occurs, do this
} finally {
  // always execute this part
}
```
