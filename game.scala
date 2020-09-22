object game {
import scala.io.StdIn.{readInt, readLine}

    def win(): Unit  = println ("congratulations! you escaped!")
    def lose(): Unit = println ("YOU DIED")

    def start(): Unit = println ("""
        |You are tied to a chair in a dark garage.
        |You can reach to a knife and a lighter.
        |""".stripMargin)

  def choice1(): String = readLine ("""
      |which one do you pick up?
      |l=lighter k=knife
      |""".stripMargin)
  def choice2(): String = readLine ("""
      |You see a door and a key on a table.
      |Were do you go?
      |p=pick up the key, d=door
      |""".stripMargin)
  def choice3(): String = readLine("""
      |Now you can open the door with the key.
      |You hear footsteps coming out from behind the door.
      |Do you open the door or back off?
      |o=open the door, b=back off
      |""".stripMargin)
  def choice4(): String = readLine("""
      |You notice a window in the garage.
      |Do you use the window to escape or use the knife to fight the kidnapper?
      |e=escape f=fight.
      |""".stripMargin)

    var isDead = false
    var isSolved = false


    def play(): Unit = {

      //Choice 1:
      while (!isDead && !isSolved) {
        val Object1: String = choice1()

        if (Object1.toLowerCase.startsWith("k")) {
          println("You got yourself loose")
          choice2()
        }
          else if (Object1.toLowerCase.startsWith("l")) {
          println("You don't want to put yourself on fire do you?")
          choice1()
          }
          else {
          println("that's not an option.")
          choice1()
          }
      }
        // Choice 2:
          while (!isDead && !isSolved) {
            val Object2: String = choice2()

            if (Object2.toLowerCase.startsWith("p")) {
              println("Now you can unlock the door with the key.")
              choice3()
            }
            else if (Object2.toLowerCase.startsWith("d")) {
              println("The door is locked.")
              choice2()
            }
            else {
              println("That's not an option.")
              choice2()
            }
          }
          //Choice 3:
        while (!isDead && !isSolved) {
          val Object3: String = choice3()

          if (Object3.toLowerCase.startsWith("b")) {
            choice4()
          }
          else if (Object3.toLowerCase.startsWith("d")) {
            println("The kidnapper found you.")
            isDead = true
          }
          else {
            println("That's not an option.")
            choice3()
          }
        }
        //Choice 4:
      while (!isDead && !isSolved) {
        val Object4: String = choice4()

        if (Object4.toLowerCase.startsWith("e")) {
          isSolved = true
        }
        else if (Object4.toLowerCase.startsWith("f")) {
          isDead = true
        }
        else {
          println("That's not an option.")
          choice4()
        }
      }



    }

  def main(args: Array[String]): Unit = {

    start()
    play()


    if (isSolved)  win()
    else if (isDead) lose()
    else  win()



  }

}