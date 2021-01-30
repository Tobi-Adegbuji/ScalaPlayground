package lectures.part2

object OOBasics extends App {
  val person = new Person("John", 25)
  println(person)
  person.greet("Tobi")
  person.greet

  val person2 = new Person("Joe")
  println(person2.age) //Will be 1

  val person3  = new Person()
  println(person3.age)
}


class Person(name: String,val age:Int = 5){ // constructor
  val x = 2 //<-- This becomes a field
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says hi: Hi, $name")
  //Notice that this.name still refers to the name field even though it is not a field
  //Scala supports overloading the same way java does
  def greet(): Unit = println(s"Hi, I am $name") //<-- Scala attaches this to the name
  //multiple constructors
  //def this(name: String) = this(name, 1) //<-- In scala, you are forced to use this when creating other constructors
  def this() = this("Johnson")
  //Notice that overloaded constructors are mostly used to provide default arguments
  //So defining multiple constructors in Scala can be quite irrelevant
  //This is because we just give default params to the initial constructor
}

//Class params are NOT FIELDS
//You must add Val or Var to make it a field.

//Notice that everything in the class block is executed when a class is instantiated
//This includes side effects as well