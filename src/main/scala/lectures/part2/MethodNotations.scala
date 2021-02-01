package lectures.part2

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String,val age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(soulMate: Person): String = s"${this.name} is in love with ${soulMate.name}"
    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)
    def unary_! : String = s"$name says what the heck!"
    def isAlive: Boolean = true
    //Method name and no params is important to apply method
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(viewNum: Int): String = s"$name watched $favoriteMovie $viewNum times."
    def unary_+ : Person = new Person(name, favoriteMovie, (age + 1))
    def learns(topic: String): String = s"$name learns $topic and likes to study it 24/7"
    def learnsJava : String = this learns "Java"
  }

  val mary = new Person("Mary","Avatar", 23)
  println(mary.likes("Avatar"))
  //Equivalent to the above. This is called infix notation aka operator notation.
  //Only works with methods with one param
  println(mary likes "Transformers")


  //"Operators" In Scala, cough cough *Methods!*
  //---------------------------------------------
  val tom = new Person("Tom", "Creed 2")
  //Notice how hangsOut with acts like a operator // Like + - * ...
  println(mary hangoutWith tom)
  //You can actually create methods that look like operators themselves! COOL
  println(tom + mary)

  //All operators in Scala are methods!
  println(1 + 2); println(1.+(2))

  //prefix notation
  val x = -1 //equivalent with 1.unary_-
  val anotherX = 1.unary_-
  //unary_ prefix only works with - + ! ~

  //These are equivalent
  println(!mary); println(mary.unary_!)

  //postfix notation: Only works with methods w/o params. The .isAlive is preferred since it avoids ambiguity
  println(mary isAlive); println(mary.isAlive)

  // apply and apply with some syntax sugar. This is like calling mary as if the value is a function. Interesting!
  println(mary.apply()); println(mary())


  //Overloaded infix operator and using apply method on it
  println((mary + "The Mother of Jesus")())
  //Unary Prefix
  println((+mary).age)
  //Infix notation
  println(mary learns "Scala")
  //Postfix Notation
  println(mary learnsJava)
  //Overloaded Apply Method
  println(mary(6785))




}
