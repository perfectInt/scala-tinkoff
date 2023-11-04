package intro

import scala.io.StdIn.readLine

object HelloUser {
  def main(args: Array[String]): Unit = {
    val name = readLine()
    println(s"Hi, ${name}!")
  }
}
