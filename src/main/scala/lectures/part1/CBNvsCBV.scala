package lectures.part1

//Call by name v Call by value
object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = { //AKA  println("by name: " + System.nanTime()) Same value x is passed other calls for x
    println("by value: " + x)
    println("by value: " + x)
  }


  //Called by name is used every time x is called.
  //By name call is useful for lazy streams and things that fail
  def calledByName(x: => Long): Unit = {
    println("by name: " + x) //AKA  println("by name: " + System.nanTime())
    println("by name: " + x) //AKA  println("by name: " + System.nanTime())
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34)
  // This will result in stack overflow

  printFirst(34, infinite())
  //This works because infinite is lazily loaded b/c its called by name


  /*
  TAKEAWAY
  Called By Value:
  -value is computed before call
  -same value is used everywhere in function

  Called By Name;
  -expression is passed literally
  -value is computed when called (lazy loading)
  -expression is evaluated at every use within function

   */



}
