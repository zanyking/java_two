package scala

/**
 * Created by iantsai on 6/14/14.
 */

class Person(name:String, age:Int, email:String){


  def getName() = {
    name
  }
  def getAge() = {
    age
  }
  def getEmail() = {
    email
  }
}

// auto generating a class with property getter and factory method.
case class CPerson(name:String, age:Int, email:String){
}

class CaseClass {
  val ianTsai = new Person("Ian Tsai", 33, "zanyking@gmail.com")

  //CPerson(String, Int, String) is the factory method of CPerson
  val BobMin = CPerson("Bob Min", 25, "bob@gmail.com")
  println(BobMin.name)

}
