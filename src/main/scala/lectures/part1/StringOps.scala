package lectures.part1

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))//7 is inclusive 11 is exclusive
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  val aNumStr = "2"
  val aNum = aNumStr.toInt
  println('a' +: aNumStr :+ 'z')
  println(str.reverse)
  println(str.take(2))


//Scala specific String Interpolators
  val name = "Tobi"
  val age = 22
  val greeting = s"Hello I am $age years old and my name is $name"
  val anotherGreeting = s"Hello I am ${age - 1} years old and my name is $name burgers per minute"

  //F-Interpolators
  val speed = 1.2f
  val myth  = f"$name can eat $speed%2.2f" //<-- At least 2 characters and 2 levels of precision

  //raw-interpolator
  println(raw"this is is a \n newline") //Does not work
  val escaped = "This is a \n newline" //Works
  println(raw"$escaped")



}

