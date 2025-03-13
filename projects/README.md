```scala
import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.io.StdIn

val words = List("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show", "jeans", "wilderness", "attempt", "waxing", "aftermath", "banana", "wrist", "wheel", "spring", "cherries", "nerve")
val word = ""
val guesses = ArrayBuffer[Char]()
var remainingGuesses = 6
var mistakes = 0


def hangman() = 
   setupGame()

def setupGame() = {
  //var currentMistakes = mistakes //make a local copy that can be changed.
  val wordIndex = Random.nextInt(words.length)
  val word = words(wordIndex).toUpperCase
  println(word)

  for (i <- word.indices)
      guesses += '-'

  var gameOver = false

  while (!gameOver)
        printGameStatus()
        println("Please enter a letter:")
        val input = StdIn.readLine()

        if (input.isEmpty) {
            println("That's not a valid input. Please try again.")
        } else {
          val letter = input.charAt(0).toUpper
          
          if (word.contains(letter)) {
        for (i <- word.indices) {
          if (word.charAt(i) == letter) {
            guesses(i) = letter
          }
        }
        if (!guesses.contains('_')) {
          gameOver = true
          println("Congratulations! You guessed the word!")
        }
      } else {
        println("Sorry, that letter is not in the word.")
        remainingGuesses -= 1
        mistakes += 1
        if (mistakes == 6) { // example of a losing condition
          gameOver = true
          println(s"Game Over! The word was: $word")
        }
      }
    }
  }


def printGameStatus()= {
  mistakes match {
    case 0 => print0Mistakes()
    case 1 => print1Mistake()
    case 2 => print2Mistakes()
    case 3 => print3Mistakes()
    case 4 => print4Mistakes()
    case 5 => print5Mistakes()
    case 6 => print6Mistakes()
    case _ => println("Error: Invalid mistake count.")
  }
  print("Word: ")
  for (element <- guesses)
     print(s"$element")

   println(s"\nYou have $remainingGuesses guess(es) left")    
}
  
   
    

def print0Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |       ")
  println("  |")
  println("  |")
  println("  |")
  println(" /|\\")
  println("/ | \\")

def print1Mistake() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |")
  println("  |")
  println("  |")
  println(" /|\\")
  println("/ | \\")
 
def print2Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |      |")
  println("  |      |")
  println("  |")
  println(" /|\\")
  println("/ | \\")
 
def print3Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |     /|")
  println("  |      |")
  println("  |")
  println(" /|\\")
  println("/ | \\")
 
def print4Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |     /|\\")
  println("  |      |")
  println("  |")
  println(" /|\\")
  println("/ | \\")
 
def print5Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |     /|\\")
  println("  |      |")
  println("  |     /")
  println(" /|\\")
  println("/ | \\")
 
def print6Mistakes() =
  println("  |------|-")
  println("  |      |")
  println("  |      O")
  println("  |     /|\\")
  println("  |      |")
  println("  |     / \\")
  println(" /|\\")
  println("/ | \\")  

//val wnumbers = (words).map(_ => Random.nextString(2))
//println(wnumbers)

//val clients = List("Michael","Jane", "Mary", "Dan")

//val somi = clients.filter(_.length < 4).foreach(println)

val chosenWord = setupGame()

chosenWord
       
//somi
//commonHigherOrderFunctionsPractice()
```
