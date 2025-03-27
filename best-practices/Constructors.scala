@main
def constructors(): Unit = {
  val c1 = Car3("BMW", 150)
  c1.show()

  val c2 = Car3()
  c2.show()

  val c3 = Car3("Fiat")
  c3.show()

  val c4 = Car3(200)
  c4.show()
}

class Car3(brand: String, topSpeed: Int):

  def this(brand: String) =
    this(brand, 150)

  def this(topSpeed: Int) =
    this("No model", topSpeed)

  def this() = this("No model", 150)

  // Fields and methods
  def show() = println(s"Car $brand top speed $topSpeed")