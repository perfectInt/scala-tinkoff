package types

import scala.io.StdIn.readLine

object SnakeCaseRegex {
  def main(args: Array[String]): Unit = {
    val snakeCaseRegex = "^[a-z]+(_[a-z]+)*$".r
    val string = readLine()
    println(snakeCaseRegex.findFirstIn(string).isDefined)
  }
}
