package lectures.part2


//SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("Static")

object Objects extends App {

  //Equivalent to a static method in Java
  //Objects do not receive parameters
  //""""CLASS-LIKE""""' FUNCTIONALITY
  object Person{
    val N_EYES = 2
    def canFly: Boolean = false

    //Factory method (sole purpose is to create Bobbie from 2 people)
    //factory methods are usually given the apply syntax
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  //INSTANCE FUNCTIONALITY
  class Person(val name: String){

  }

  //When you have an object and a class in the same file or scope they're called companions
  //Notice that everything you access in Scala is coming from an instance. This makes scala truly OOP!
  //This makes Scala even more object oriented than most languages that are OOP.

  //Notice how we are using this like static method and vars in java
  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object is a singleton instance
  val mary = Person
  val john = Person
  //Both of mary and john always point to this same instance
  print(mary == john)

  //These point to different references since they have instance functionality
  val josh = new Person("Josh")
  val drake = new Person("Drake")

  println(josh == drake)

  //Using the factory method which is disguised as an apply method
  val bobbie = Person(josh, drake)

  //Scala Applications = Scala object with: def main(args; Array[String]): Unit
  //So when we extend App it contains the main method to run
}
