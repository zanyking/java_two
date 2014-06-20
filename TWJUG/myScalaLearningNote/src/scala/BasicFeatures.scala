package scala

/**
 * Created by iantsai on 6/13/14.
 */
class BasicFeatures {

  //type: Tuple2, (Int, String)
  val t2 = (123, "Hello")
  val t = 1 -> "abc"

  //type: immutable Map[Int, String]
  val m1 = Map(1->"one", 2->"two")
  m1(1)
  // prove the type of each map's entry is Tuple2
  m1.foreach(x => println(x.getClass))

  val m2 = m1++m1


  // a List[Int] with 5 elements
  val list1 = List(1,2,3,4,5)

  // a List[Any] with 5 elements
  val list2 = List(1,"abc",3,4,5)

  // yes, this is an anonymous function
  val func = (x:Any) => print(x.toString)

  func("Hello world!")
  func(123)
  //a nag way to call a function
  //abbreviation rule: function 'apply' is reserved, it's a kind of default action of this object.
  func.apply(2)


  // closure
  var var1 = 10
  val aClosure = (x:Int) => var1+x
  // ans: 13
  aClosure(3)
  var1 = 20
  // ans: 23
  aClosure(3)
}
