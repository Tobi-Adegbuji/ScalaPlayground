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
  case class Animal(gender: String="unknown", age: Int=0){
    //The return type is not necessary but is good practice for public methods
    //Moreover, in Scala, since the return word at the end of the method is optional,
    //the last statement is always the one that is returned to the caller of the method.
    def +(otherAnimal: Animal) : Animal = Animal(age = age + otherAnimal.age)
  }

  /*
  case classes contain additional features among which one is a factory method to create
  instances (no need to use the new keyword to create one)

  By default, the fields declared in Scala classes are public, unlike Java, where they have
a package-private scope, defined between private and protected.

  You could make them private if you would like
   */

  val animal1 = Animal()
  val animal2 = Animal("Male")
  val animal3 = Animal(age = 5) //Since age is not first in parameters order
  val animal4 = Animal("Female", 21)


  //You can copy classes as well and also assign new values from that.
  val animal5 = animal4.copy(gender = "Male")
  println(animal5)

  //Here we are using the method I created within the case class.
  val animal6 = animal3 + animal4
  println(animal6)






}
