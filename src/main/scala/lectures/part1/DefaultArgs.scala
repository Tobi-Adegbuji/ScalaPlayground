package lectures.part1

import scala.annotation.tailrec

object DefaultArgs extends App {

  //Recursive factorial with an auxiliary func
  def factorialTail(n: Int): Int = {
    @tailrec
    def factorialHelp(i: Int, acc: Int):Int =
      if(i <= 1) acc
      else factorialHelp(i - 1, acc * i)
      factorialHelp(n, 1)
  }

  //Recursive factorial w/o auxiliary function
  def anotherFactorialTail(n: Int, acc: Int): Int = {
    if(n <= 1) acc
    else anotherFactorialTail(n-1, n * acc)
  }


  //The latter is shorter than the former
  //But it is annoying that we have to keep putting 1 for the acc each time we call the func
  val fact10 = anotherFactorialTail(10,1)

  //Scala allows us to use default values like so:
  def factorialTailDefault(n: Int, acc: Int = 1): Int = {
    if(n <= 1) acc
    else anotherFactorialTail(n-1, n * acc)
  }

  //Now we have an option to pass a value or not.

  factorialTailDefault(10) //Just passing 10
  factorialTailDefault(10, 2) // Still have an option to choose an acc

  //Default values come with their own challenges
  //Imagine you created a rest api with an exposed function that saves a pic
  def savePicture(format: String = "jpg", height: Int = 1920, width: Int = 1080): Unit = println("Saving Pictures")

  //The compiler will be confused since you did not start with a leading argument
 // savePicture(800)

  //There are 2 ways to solve this:
  //Pass in the leading args
  //Name the args

  //Naming the args below
  savePicture(height = 800, format = "bmap")






}
