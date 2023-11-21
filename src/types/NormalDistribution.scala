package types

object NormalDistribution {
  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    val res = Math.pow(math.E, -(Math.pow(x - mu, 2) / (2 * sigma * sigma))) / (sigma * Math.sqrt(2 * math.Pi))
    res
  }
}
