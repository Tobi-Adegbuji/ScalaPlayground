package lectures.part2

object AbstractDataTypes extends App {

  //Example of Abstract class
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  //Implementing abstract Class
  class Dog extends Animal{
    override val creatureType: String = "K9"
    override def eat: Unit = "CRUNCH CRUNCH"
  }


  //Example of Traits
  trait Carnivore{
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  //You can implement as many traits as you want


  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    override def eat: Unit = println("nom nom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)


  //NOTICE: Traits and abstract classes can both have abstract and non abstract types
  //So what is the difference between them?
  //Traits do not have constructor parameters
  //You can only extend 1 abstract class while you can implement as many traits as you want
  //Traits are behavior... while abstract class is a type of "thing"


  /*
  Scala Type Hierarchy:
  Scala.Any is the base class of all classes
  scala.Nothing is a subtype of every single thing in Scala
   */

}
