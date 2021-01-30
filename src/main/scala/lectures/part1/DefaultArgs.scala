package lectures.part1

import scala.annotation.tailrec

object DefaultArgs extends App {

  def factorialTail(n: Int): Int = {
    @tailrec
    def factorialHelp(i: Int, acc: Int):Int =
      if(i <= 1) acc
      else factorialHelp(i - 1, acc * i)

      factorialHelp(n, 1)
  }

  //
}
