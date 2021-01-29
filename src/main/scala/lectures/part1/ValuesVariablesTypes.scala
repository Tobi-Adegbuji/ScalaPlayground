package lectures.part1

object ValuesVariablesTypes extends App {

  //VAL IS IMMUTABLE
  //Type inference: COMPILER can infer types
  val aVal = 42
  println(aVal)

  //String type
  val aString: String = ""

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = 54 //4 BYTES
  val aShort: Short = 4613 //2 BYTES
  val aLong: Long = 213131324342423L //8 BYTES
  val aFloat: Float = 434353.5f
  val aDouble: Double = 434353.343


  //VAR IS MUTABLE
  var aVariable = 4
  aVariable = aVariable + 1
  //Vars are used in FP as side effects. They allow us to see what our programs are doing.
  //A side effect is any application state change that is observable outside the called function other than its return value.


}
