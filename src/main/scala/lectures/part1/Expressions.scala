package lectures.part1

object Expressions extends App{

  val x = 1 + 2 //<- EXPRESSION
  println(x)

  println(2 + 3 * 4)
  //Math operators: + - * /
  //Bitwise operators: &, |, ^, <<, >>, >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  //Logical Operators: ! && ||

  var aVariable = 2
  aVariable += 3 //Also works with -= , *=, /= ...... These are all side effects since you are mutating the var
  println(aVariable)

  // Instructions: TO DO SOMETHING
  // EXPRESSIONS: GIVE ME THE VALUE OF SOMETHING

  //If Expression
  val aCondition = false
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  //NOTICE HOW THE if Expression returns a value
  //In most languages you would have to do something like this:
  /*
  if(aCondition)
    aConditionValue = 5
  else
  `aConditionValue = 3
   */


  //LOOPS ARE DISCOURAGED IN SCALA

  var i = 0
  while(i < 10){
    println(i)
    i += 1
  }

  //NEVER WRITE THE ABOVE AGAIN!
  //Looping is for imperative languages

  //EVERYTHING IN SCALA IS AN EXPRESSION
  var anotherVar = 5
  val aWeirdValue = (anotherVar = 3) //Unit is equivalent to void
  println(aWeirdValue) //<-- Prints ()

  //Side effects in Scala are expressions that return Unit
  //Below is an example of a side Effect.
  val whileLoop = while(true){
    println("Never Ending")
  }

  //side effect: println(), whiles, reassigning

  //Code blocks
  //A code block is an expression
  //The value of the entire block is the last expression.
  //Values in code blocks have ONLY LOCAL SCOPE
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }


  //1 What is the difference between "Hello World" and println("HelloWorld")
  //println is an expression that is a side effect of type Unit, while the string hello world is a value of type String

  //2 What is the value of this:
  val someValue = {
    2 < 3
  }
  //True

  //3 What is the value of this?
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  //The value is 42



}
