package lectures.part1

object Functions extends App {

  //It is best practice to mention the return type on functions

  def aFunction(a: String, b: Int): String = s"$a $b"

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction) //<-- Don't need a () for no parameters

  //How to do looping in functional way
  //The compiler cannot figure out the type of a recursion function on its own
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1) //Attaching String to recursive call which also returns a string
  }

  println(aRepeatedFunction("hello", 3))

  ///WHEN YOU NEED LOOPS, USE RECURSION


  //We need side effects if we want to print to a screen, create a file and what not
  //Again, side effects are expressions (everything in scala is an expressions) that return Unit
  def aFunctionWithSideEffects(aString: String):Unit = println(aString)

  //Code blocks can also contain auxiliary functions
  val biggerFunction = (text: String) => {
    def smallerFunction(a: Int, b: Int): Int = a + b
    s"$text ${smallerFunction(5,5)}"
  }

  println(biggerFunction("The sum is: "))


  /*
  Write a greeting fun for kids. Parameters are name and age and return greeting
  Write a factorial function
  Write a Fibonacci function
  Test if a number is prime
   */

  def greet(age: Int, name: String): String = s"Hi, my name is $name and I am $age years old."

  def factorial(n: Int): Int = {
    if (n == 0) return 1
    if (n > 0) n * factorial(n - 1)
    else n * factorial(n + 1)
  }


  //5 <-- 4 + 3//
  def fib(n:Int): Int = {
    if(n <= 2) 1
    else fib(n-1) + fib(n-2)
  }

  def isPrime(n: Int): Boolean = {
    if(n % 7 != 0 || n % 5 != 0 || n % 3 != 0 || n % 2 != 0 ) true
    else false
  }

  println(isPrime(5))

  //Left off 18:35 FUNCTONS

}
