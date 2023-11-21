package types

import scala.io.StdIn.readLine

object Reverse {
  def main(args: Array[String]): Unit = {
    val Array(startIndex, endIndex) = readLine().split(" ").map(_.toInt)
    val string = readLine()
    println(string.take(startIndex) + string.slice(startIndex, endIndex + 1).reverse + string.slice(endIndex + 1, string.length))
  }
}
