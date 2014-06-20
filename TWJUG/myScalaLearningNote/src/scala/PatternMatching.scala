package scala

/**
 * Created by iantsai on 6/14/14.
 */
class PatternMatching {
  def toStrDesc(x:Int): String =
    x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }


  // multiple to Multiple
  def switch(x:Any): Any = {
    x match {
      case 1 => 12
      case "-op" => "an operation"
      case i:Int => "Int="+i
      case s:String => "Str="+s
    }
  }

}


class PatternMatching_adv {



  // map op + pattern matching
  def swapWords(strs: List[String]):List[String] = strs.map {
    case "t" => "This "
    case "i" => "is "
    case "m" => "my "
    case x => x
  }
  swapWords(List("t","i","m","book")).reduce((x,y)=> x+y)





  // an example to use pattern matching to implement a Main arguments parser...
  def parseArgument(arg : String, value: Any) = (arg, value) match {
    case ("-l", lang) => setLanguageTo(lang)
    case ("-o" | "--optim", n : Int) if ((0 < n) && (n <= 5)) => setOptimizationLevelTo(n)
    case ("-o" | "--optim", badLevel) => badOptimizationLevel(badLevel)
    case ("-h" | "--help", null) => displayHelp()
    case bad => badArgument(bad)
  }

  def setLanguageTo(s: Any):Unit = {
    //...
  }
  def setOptimizationLevelTo(n:Int) = {
    //...
  }
  def badOptimizationLevel(badLevel:Any)={
    //...
  }
  def displayHelp() = {}

  def badArgument(bad: (String, Any))={
    //...
  }
}





// define a small language using scala
sealed abstract class AstNode
case class X() extends AstNode
case class Const(value : Int) extends AstNode
case class Add(left : AstNode, right : AstNode) extends AstNode
case class Mult(left : AstNode, right : AstNode) extends AstNode
case class Neg(expr : AstNode) extends AstNode

class Parser{

  def eval(node : AstNode, xValue : Int) : Int = node match {// BNF form
    case X() => xValue
    case Const(cst) => cst
    case Add(left, right) => eval(left, xValue) + eval(right, xValue)
    case Mult(left, right) => eval(left, xValue) * eval(right, xValue)
    case Neg(expr) => - eval(expr, xValue)
  }


}
object Main{
  def main(args:Array[String]) {
    // impl a tokenizer that can construct an AST based on expr like this: 1 + X + 2 * X*X
    // the result ASTree should be like this:
    val ast = Add(Const(10), Add(X(), Mult(Const(2), Mult(X(), X()))))  // 1 + X + 2 * X*X

    println("ast: "+formatString(ast))
    println(new Parser().eval(ast, 3))
  }

  def formatString(node: AstNode):String = node match {//S Expression
    case X() => "x"
    case Const(cst) => cst.toString
    case Add(left, right) =>  "(+ "+formatString(left) +" "+ formatString(right)+")"
    case Mult(left, right) => "(* "+formatString(left) +" "+ formatString(right)+")"
    case Neg(expr) => "(- "+ formatString(expr)+")"
  }
}