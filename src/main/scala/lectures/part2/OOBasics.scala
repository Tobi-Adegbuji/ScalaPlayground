package lectures.part2

import scala.annotation.tailrec

object OOBasics extends App {
  val person = new Person("John", 25)
  println(person)
  person.greet("Tobi")
  person.greet

  val person2 = new Person("Joe")
  println(person2.age) //Will be 1

  val person3  = new Person()
  println(person3.age)


  println("EXERCISES -------")

  val author = new Author("Charles", "Dickens", 1012)
  val imposter = new Author("Charles","Dickens",  1012)
  val novel = new Novel("Great Expectations", 1861, author)

  println(author.year)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  println(counter.inc.count)
  println(counter.inc(5).count)

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

/*
Create Novel and Writer Classes

Writer; firstName, surname, year
-method: fullname

Novel: name, yearOfRelease, author
- authorAge
-isWrittenBy(author)
copy (new year of release) = new instance of novel
*/


class Novel(name: String, year: Int, author: Author){
  def authorAge(): Int = year - author.year
  def isWrittenBy(author: Author) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name,newYear,author)
}

class Author(firstName: String, surname: String, val year: Int){
  def fullName(): String = s"$firstName $surname"
}

class Counter(val count: Int = 0){
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  } //immutability: <-- Replaces setter
  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

  @tailrec
  final def inc(amount: Int):Counter = {
    if(amount <= 0) this
    else inc.inc(amount - 1)
  }

  @tailrec
   final def dec(amount: Int):Counter = {
    if(amount <= 0) this
    else dec.dec(amount - 1)
  }

}



/*
Create Counter Class
  -receives int value
  -method current count
  -method to increment/decrement = new Counter
  -overload inc/dec to recieve an amount
 */