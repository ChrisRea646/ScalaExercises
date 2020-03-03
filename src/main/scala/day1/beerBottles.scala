package day1

object beerBottles extends App{
  var i = 7
  for (i <- i to 0 by -1)
    if (i == 0)
      println("You've not got any more beer.. Go get more")
    else if (i == 1)
      println(s"$i more bottle of beer on the wall, only $i more bottle of beer, take it down pass it around")
    else
      println(s"$i bottles of beer, $i bottles of beer on the wall, $i of beer, take one down pass it around")

}
