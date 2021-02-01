package lectures.part2

object InheritanceAndTraits extends App {

  //Scala has single class inheritance
  //Using sealed to only allow cat class to extend Animal
  //Classes that extend Animal in this file are the only classes that can extend Animal (b/c of sealed keyword)
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("Munch")
    private def run = println("I am running!")
    protected def jump = println("I am jumping!")
  }
  //Subclass
  //Overriding in the constructor
  class Cat(override val creatureType: String = "Domestic") extends Animal{
    //Overriding while using super to get method
    override def jump = super.jump

//    override val creatureType: String = "domestic"
  }
  val cat = new Cat()
  //Super method
  cat.eat
  //Protected works with subclasses
  cat.jump
  //Doesnt work
  //cat.run
  println(cat.creatureType)



  //Constructors
  class Person(name: String, age: Int)
  //Must extend Person like so or it Cannot work b/c the JVM needs to call constructor of Person before calling adult.
  class Adult(name: String, age:Int, idCard: String) extends Person(name, age)


  //Type substitution (POLYMORPHISM)
  val unknownAnimal: Animal = new Cat("Domesticated")

  //Preventing overrides
    //1 - Use final keyword
    //2 - Use final on the entire class
    //3 - Seal the class = extend classes in this file but prevent extension in other files



}
