object ScalaBasics extends App{
  //val declares object as immutable
  val devType : String = "Scala Developer"

  //If you try to change devType you get an error.
  //devType = "Java Developer"

  //Use var if you want it to be mutable
  var yourFuture = "Your future..."
  yourFuture = yourFuture + " can be changed."
  println(yourFuture)

  //Scala uses type inference so you do not need to specify the type
  val name = "Tobi"


  //Scala is made of only objects and classes. NO PRIMITIVES

  //This means operators in Scala are really method calls
  //The below expression is equivalent to 2.+(3)
  var integer = 2 + 3
}
