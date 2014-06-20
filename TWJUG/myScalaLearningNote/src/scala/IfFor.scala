package scala

/**
 * Created by iantsai on 6/14/14.
 */
class IfFor {

  val z = 10
  val b = 20

  // if clause has return value
  val x = if(3>2) 123 else 456

  val y = if(z > b) 123 else throw new IllegalArgumentException("of course Z > B is false!!!")
  //
  for(x <- (0).to(200) ){
    println(x)
  }

  // for with result
  val l1 = List(1,2,3,4)
  val ans = for(x <- l1) yield x*10
  // 10, 20, 30, 40


}


class ComplexFor{



  val filesHere = (new java.io.File("/Users/iantsai/dev/working_copy/temp")).listFiles

  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines.toList

  def grep(pattern: String) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file +": "+ line.trim)

  grep(".*gcd.*")

}