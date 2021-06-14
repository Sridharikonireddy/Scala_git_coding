# Scala_git_coding
/*class ArrayExample{
  var arr = Array(1,2,3,4,5)
  def show(){
    for(a<-arr)                       // Traversing array elements
      println(a)
    println("Third Element  = "+ arr(2))        // Accessing elements by using index
  }
}

object Array1{
  def main(args:Array[String]){
    var a = new ArrayExample()
    a.show()
  }
}*/

/*class ArrExample
{
  var ar=Array(1,2,3,4,5,6,7,8,9)

  def Demo()
  {
    for(i<-ar)
        println(i)
  }

}
object Array1
{
  def main(args:Array[String])
  {
    var i = new ArrExample()
    i.Demo()
  }
}*/

class ArrayExample{
  var arr = new Array[Int](5)
  def show(){
    for(a<-arr){
      println(a)
    }
  }
}

object SingleArrays{
  def main(args:Array[String]){
    var a = new ArrayExample()
    a.show()
  }
}



