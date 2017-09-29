import scala.math
object chick extends  App {


  def fac(num:Double): Double ={

    def fac1(res:Double,num:Double): Double ={
      println("res:"+res+" double:"+num)

      if (num==0.0) res
      else fac1(res*num,num-1.0)
    }
    def collect(res: Double, num: Double) =
      res*num



    fac1(1.0,num)
  }

  println(fac(9.0))
}