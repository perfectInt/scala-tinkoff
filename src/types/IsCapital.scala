package types

object IsCapital {
  def main(args: Array[String]): Unit = {
    println(isCapital("Scala", 0))
  }

  def isCapital(word: String, pos: Int): Boolean = {
    val ch = word.charAt(pos)
    ch >= 'A' && ch <= 'Z'
  }
}
