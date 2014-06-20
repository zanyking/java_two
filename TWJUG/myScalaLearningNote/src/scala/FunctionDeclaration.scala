package scala

/**
 * Created by iantsai on 5/7/14.
 */
class FunctionDeclaration {

  // Nagging...
  var max: (Int, Int)=>Int  =  (m: Int, n:Int) => if(m>n)m else n

  // formal...
  var max2 = (m: Int, n:Int) => if(m>n)m else n



//  var max3 = (m, n) => if(m>n)m else n


  def doSomething(arr: Array[Int], order: (Int, Int) => Boolean): Int = {
    //...
    if(order(arr(0), arr(1))) arr(0) else arr(1)
    //...
  }
  // shortened function declaration with enough type context...
  val max4 = doSomething(Array(40,25,2), (a, b)=>a>b)
  // go extreme...
  val max5 = doSomething(Array(40,25,2), (_:Int) >(_:Int))
  // go extreme...
  val max6 = doSomething(Array(40,25,2), _ >_)
}
