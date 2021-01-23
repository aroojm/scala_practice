/* prints true if the input lines are real planets
   of the Solar system and false otherwise.
 */

object PlanetsGame extends App {
  val set = Set("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  val first = scala.io.StdIn.readLine()
  val second = scala.io.StdIn.readLine()
  val third = scala.io.StdIn.readLine()
  if (set(first) && set(second) && set(third)) println("true") else println("false")
}