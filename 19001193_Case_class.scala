//Index No: 19001193
object caseclass extends App{
  println("\tSCS2204 Functional Programming - Case class\n\t-------------------------------------------\n")
  val p1 = Point(8,6);
  val p2 = Point(3,9);
  
  println("[Point Objects]")
  println(p1)
  println(p2)
  println("\n")
  
  println("[Add two given point]")
  val p3 = p1 + p2
  println(p3)
  println("\n")
  
  println("[Move P1 by a given distance(7,5)]")
  val p4 = p1.move(7,5)
  println(p4)
  println("\n")
  
  println("[Distance between two given points]")
  val p5 = p1.distance(p2)
  println(p5)
  println("\n")
  
  println("[Invert switch the x and y]")
  val p6 = p1.invert()
  println(p6)
  val p7 = p2.invert()
  println(p7)
  

}

//case class
case class Point(x:Int, y:Int){

  def +(that:Point)=Point(this.x+that.x, this.y+that.y)
  def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
  def distance(that:Point)=Point(Math.abs(this.x-that.x), Math.abs(this.y-that.y))
  def invert() =Point(this.y, this.x)
}