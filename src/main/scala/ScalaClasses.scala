object Main extends App{

  //How to define a class in Scala
  class Human(val name: String, var age: Int)

  //Creating an instance
  val human1 = new Human("Tobi", 22);

  //Accessing human name
  println("My name is " + human1.name)
  //Age has a setter while name does not since it is a val
  human1.age = 5
  val newAge = human1.age
  println("My new age is " + newAge)


  /*
  As Java developers, we are accustomed to the JavaBean style domain classes that not
  only include fields with getters and setters but also constructors as well as hashCode,
  equals, and toString methods.

  Scala does all this in one line with case class:
   */

  //Notice we can also declare default values
  case class Animal(gender: String="unknown")




}
