import scala.math
object chick extends  App {
  sqrt(3333)
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
      math.abs(math.sqrt(guess) - x) < 0.001

    sqrtIter(1.0, x)
  }
}