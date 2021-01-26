
object ScalaCollectionOperations extends App{

  val numbers = List(1,2,3,4,5,6)

  //Java Iterative Approach
  for(n <- numbers) print(" " + n)
  println()

  //Scala Functional Approach
  numbers.foreach(num => print(" " + num))
  println()

  //Reversing a List
  val reversedList = numbers.reverse
  print(reversedList)
  println()

  //Dropping first 2 two items and then only allowing the first 3 values
  //Moticed take is invoked on the result of drop (Method Chaining)
  val onlyAFew = numbers drop 2 take 3
  print(onlyAFew)
  println()

  //Using the cons operator to create a list
  val names = "Tobi" :: "John" :: "Liz" :: Nil

  //There is a simple rule in Scala that says a methods whose last character is : is applied on its
  //right side rather then its left side. Such a method is called right-associative

  //So the above actually looks like this:
  // sampleList  = Nil.::("Liz").::("John").::("Tobi")
  //Think of the :: method as something that appends before


  //Lets concat two list together
  val otherThings = true :: "Lindsay" :: 23 :: Nil

  val combinedList = names ::: otherThings

  println(combinedList)



  //Lets create a collection with more complex objects within it

  case class Student(age: Int=0, name: String="")

  val listOfStudents = Student(21,"Sean") :: Student(25,"Betty") :: Student(17,"Patrice") :: Nil


  val firstStudent = listOfStudents.head
  println()
  println("Head of Students")
  println(firstStudent)

  val lastStudent = listOfStudents.tail
  println()
  println("Tail of Students")
  println(lastStudent)

  //Filter method takes an anonymous function and applies the predicate to each element in the collection
  val students21AndOlder = listOfStudents.filter(student => student.age >= 21)
  println()
  println("21 and Older Students")
  println(students21AndOlder)

  //You can shorten the syntax between of the arrow and the student paramter as follows:
  val students25AndOlder = listOfStudents.filter(_.age >= 25)
  //The underscore stands for "that thing" So it represents the current element

  //FilterNot is the opposite of filter method. Stores elements that falsify against the predicate
  val studentsUnderAge = listOfStudents.filterNot(_.age >= 21)
  println()
  println("Underage Students - filterNot")
  println(studentsUnderAge)

  //partition method is used to combine the the filter and filterNot methods into a single call that returns 2 collections
  val studentsOverAgeAndUnderAge = listOfStudents.partition(_.age >= 21)

  //But how can a variable contain two results? Tuples...

  //Here is how to access the first list returned by the partition method:
  val legalToDrink = studentsOverAgeAndUnderAge._1
  val illegalToDrink = studentsOverAgeAndUnderAge._2

  //A cleaner way to make this one-liner
  val (canDrink, cannotDrink) = listOfStudents.partition(_.age >= 21)
  println()
  println("Legal & Illegal Drinking - partition")
  println(canDrink ::: cannotDrink)



}
