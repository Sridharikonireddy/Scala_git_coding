
/*object While
{
    def main(args:Array[String]): Unit =
  {
    var a=10
    while(a<=20)
      {
        println(a)
        a=a+4
      }
  }
}*/
/*object While {
  def main(args: Array[String]) {
    var a = 10
    while(true){
      println(a)
      a = a+2
    }
  }
}  */

object While {
  def main(args: Array[String]) {
    var a = 10
    do {
      println(a)
      a = a+2
    }
    while(a<=30)

    }
  }
/*object Iterative
{
    def main(args:Array[String]): Unit =
  {
     for(a<- 1 to 100)
    {
      println(a)
    }
  }
}*/

/*object Iterative
{
  def main(args: Array[String]): Unit = {
    for (a <- 1 until 30) {
      println(a)
    }
  }
}*/

/*object Iterative {
  def main(args: Array[String]): Unit = {
    for (a <- 1 until 30)  // for( a <- 1 to 30 if a%2==0 ){
      if (a % 2 == 0)
        {
        println(a)
      }
  }*/
/*object Iterative {
  def main(args: Array[String]){


    var result = for (a <- 1 to 10) yield a
   //for (i <- result) {
      println(result)
   // }
  }
}*/
/*object Iterative {
  def main(args: Array[String]) {
    var list = List(1,2,3,4,5,6,7,8,9)
    for( i <- list){
      println(i)
    }

  }
}*/


/*object Iterative {
  def main(args: Array[String]) {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    list.foreach(println)
  }
}*/


object Iterative {
  def main(args: Array[String]) {
    for(i<-1 to 10 by 4){
      println(i)
    }
  }
}


