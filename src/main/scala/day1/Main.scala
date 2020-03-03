package day1

object Main extends App {

  println("Hello World!")

  val name = "Chris"
  //name = "George" -- VAL cant be changed, hense this wont work

  var car = "Ford"
  car = "Audi"
  //this will work as var is mutable(can be changed)

  //methods rely on the values within an object
  //functions will perform the same thing on whatever is inputted i.e a doubling function

  val hi = "Hello world!"

  println(hi)


  var i = 7
  for (i <- i to 0 by -1)
    println(s"$i bottles of beer, $i bottles of beer on the wall, $i of beer, take one down pass it around \n")

}
