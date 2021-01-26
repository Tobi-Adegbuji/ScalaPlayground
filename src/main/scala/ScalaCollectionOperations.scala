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
  val onlyAFew = numbers drop 2 take 3
  print(onlyAFew)
  println()



}
