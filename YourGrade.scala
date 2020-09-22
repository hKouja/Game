object YourGrade {
  import scala.io.StdIn.{readInt, readLine}
  def main(args: Array[String]): Unit = {


    println("Your Grade: ")

    val x = 80
    val i = Range (65, 79)
    val y = Range (80, 100)

    if (x == y)
      println("VG")

    else if (x == i)
      println("G")

    else
      println("UK")
  }
}