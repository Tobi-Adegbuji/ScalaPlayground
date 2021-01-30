package lectures.part1

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) n
    else {
      println(s"factorial of $n - I first need factorial of ${n - 1}")
      val result = n * factorial(n - 1)
      println(s"Computed factorial of $n")
      result
    }
  }

  //RECURSIVE CALLS GET STORED IN A MEMORY STACK UNTIL IT HITS BASE CASE AND CAN SOLVE IS WAY BACK UO
  //tHE ISSUES IS THIS WILL CAUSE A STACK OVERFLOW IF THE INPUT VALUE IS TOO LARGE
  //println(factorial(5000))

  //How do we overcome this limitation?

  def anotherFactorial(n: Int): BigInt = {
    @tailrec //Tells compiler to make sure this function is tail recursive
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST Expression

    factorialHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
  factorialHelper(9, 10 * 1)
  factorialHelper(8, 9 * 10 * 1)
  factorialHelper(7, 8 * 9 * 10 * 1)
  .....
  factorialHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  factorialHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  Now it will stop at the base case and return its accumulator

  Why does this not crash with a large value like the other factorial
  It does not have to do with factHelper being an auxiliary function

WHEN YOU NEED LOOPS, USE TAIL RECURSION

   */

  //1 Concatenate a string n times
  //2 IsPrime func tail recursive
  //3 Fib tail recursive

  @tailrec
  def concatenateString(n: Int, aString: String, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateString(n - 1, aString, accumulator + aString)

  println(concatenateString(3, "Hello", "3 times: "))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
      isPrimeTailRec(n/2,true)
  }

  println(isPrime(23))

  def reverseAString(aString: String): String = {
    @tailrec
    def reverseHelper(i: Int, acc: String): String =
      if(i <= -1) acc
      else reverseHelper(i - 1, acc + aString.charAt(i))
      reverseHelper(aString.length - 1, "")
  }

  println(reverseAString("Hello"))


}
