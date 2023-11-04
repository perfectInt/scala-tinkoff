package intro

import scala.io.StdIn.readInt

object TwoNums {
  def main(args: Array[String]): Unit = {
    val num1 = readInt()
    val num2 = readInt()
    println(num1 - num2)
  }
}
