@main
def functionOverloadingChallenge(): Unit = {
  cost("coffee", 4.99)

  val products = Map("cake" -> 3.99, "soda" -> 1.59, "burger" -> 6.99)
  cost(products)
}

def cost(product: String, price: Double): Unit =
  println(s"A $product costs ${price * 1.2}")

def cost(products: Map[String, Double]): Unit =
  for (product <- products.keys)
    cost(product, products(product))