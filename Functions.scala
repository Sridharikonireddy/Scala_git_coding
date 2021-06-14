

/*  object Functions
{
  def main(args: Array[String]) {
    functionExample()          
  }
  def functionExample()  {        
    println("This is a simple function")
  }
}*/





/*object Functions
{
  def Function(): Unit =
  {
    println("hi")
  }
  def main(args: Array[String])
  {
    Function()
  }
}*/

/*object Functions {
  def main(args: Array[String]) {
    var result = functionExample()         
    println(result)
  }
  def functionExample() = {       
    var a = 10
    a
  }
}*/

 /*  object Functions
  {
    def function1() = {      
      var a = "Sree"
      a
    }
  def main(args: Array[String]) {
    var S1 = function1()          
    println(S1)
  }

  }*/
 /*object Functions
{
  def function1()={
    var S1 = "Sree"
    S1
  }
  def main(args:Array[String]): Unit =
  {
    var a = function1()
    println(a)
  }

}*/

/*object Functions
{
  def function1(): Unit =
  {
    println("sree")
  }
  def main(args:Array[String]): Unit =
  {
    function1()
  }

}*/
 /*object Functions{
  def function(a:Int,b:Int): Unit =
  {
    var c=a+b
    println(c)
  }
  def main(args:Array[String])=
  {
     function(20,30)
  }
}*/

/*object Functions{
  def Function1(a:Int,b:Int)
  {
    var res=a/b
    println(res)
  }
  def main(args:Array[String])
  {
    Function1(200,10)
  }
}*/

/*  object Functions
  {
    def function1() = {       // Defining a function
      var a = "Sree"
      a
    }
  def main(args: Array[String]) {
    var S1 = function1()          // Calling function
    println(S1)
  }

  }*/
  

/* object Functions{


    def main(args:Array[String]): Unit =
  {
       var s =function1(4,2)
    println(s)
  }
  def function1(a:Int,b:Int):Int=
  {
    if(b==0)
      0
    else
      b + function1(a-1, b)
  }
}*/



object Function {
  def main(args: Array[String]) {
    var result = function1(1, 2)
    var result1 = function1(1, 3)
    var result2 = function1(1, 4)
    println(result + result1 + result2)
  }

  def function1(a: Int, b: Int): Int = {
    a + b

  }
}















