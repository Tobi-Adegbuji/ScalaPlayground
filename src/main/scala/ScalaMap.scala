object ScalaMap extends App{

  val list = List(1,2,3,4,5,6)

  //Map is used to transform the object
  val newList = list.map(num => num * 2)

  println(newList)

}
