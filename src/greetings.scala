/*
output greetings for the user with the name received by input.
 */
object Greetings extends App {
  val name = scala.io.StdIn.readLine()
  val list = "Hello, " :: name :: "!" :: Nil
  println(list.mkString(""))
}