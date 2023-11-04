package intro

import scala.io.StdIn.{readInt, readLine}

object MultipleThreeNums {
  def main(args: Array[String]): Unit = {
    val num1 = readInt()
    val num2 = readInt()
    val num3 = readInt()
    println(num1 * num2 * num3)
  }
}
