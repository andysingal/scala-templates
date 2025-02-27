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

## if-else condition
```scala
def ifStatement(): Unit = {
  //val night = true

  //if (night)
   // println("Sleep, it night time")
  //else
  //  println("Be active, its day time")

  println("Please input the funds amount")
  var clientFunds = StdIn.readLine().toInt
  val price = 50
  var clientProducts = 0

  if (clientFunds >= price)
         clientFunds -= price
         clientProducts += 1
         println(s"You have purchased $clientProducts products") 
         println(s"You have $$$clientFunds")
  else
     println("You have insufficient funds")
}
```

```scala
def ifStatement(): Unit = {
  val petStore = List("cat", "dog", "rabbit")
  val hascatfood = true

  if (petStore.contains("cat"))
    if (hascatfood)
       println("Buy cat and cat food")
    else
       println("Buy cat")
       
  else
    println("Ask pet store to get cat")
}
```

```scala
import scala.io.StdIn

def ifStatementPractice(): Unit = {
  println("Do you have the keys? (true/false)")
  val hasKeys = StdIn.readLine().toBoolean

  if (hasKeys)
      println("Start the car")
  else
     println("Cannot start the car without keys")

```


```scala
import scala.io.StdIn

def ifStatementPractice(): Unit = {
   println("Please input the current hour (0-23))")
   val input = StdIn.readline()
   try {
     val hour = input.toInt
     if (hour < 12)
        println(s"It's $hour AM")
     else if (hour == 12)
        println(s"It's $hour PM")
} catch {
  case e: NumberFormatException =>
    println("Cannot read that number")
    e.printStackTrace()
}
}
```


   
   
