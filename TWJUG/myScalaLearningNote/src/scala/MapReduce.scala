package scala

/**
 * Created by iantsai on 6/14/14.
 */
class MapReduce {


  val list1 = List(1,2,3,4,5,6)
  val list2 = List("a","b","c","d","e","f")
  val list3 = List("a","b","c","d","e")

  list1.zip(list2)
  // List[(Int, String)] = List((1,a), (2,b), (3,c), (4,d), (5,e), (6,f))

  list1.zip(list3)
  // List[(Int, String)] = List((1,a), (2,b), (3,c), (4,d), (5,e))


  def func1(x:Int, y:Int):Int={ println(s"x,y=${x},${y}"); x+y}
  list1.reduce((x,y) => x+y)
  list1.reduce((x,y) => func1(x,y))


  list1.map(v => v+2)
  //List[Int] = List(3, 4, 5, 6, 7, 8)

  val m1 = Map(1->"one", 2->"two", 3->"three", 4->"four")
  m1.map(entry=> (entry._1+1)->("#"+entry._2))


}
