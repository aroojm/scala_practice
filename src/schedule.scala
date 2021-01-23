/*
  A program that will maintain the duty schedule for a team.
  The program gets the day of the week and prints out who is
  on duty on this day and how many day-offs a person will get.
 */
object DutySchedule extends App {

  val dutySchedule = Map(
    "Monday" -> ("Alice", 1.0),
    "Tuesday" -> ("Bob", 1.0),
    "Wednesday" -> ("Scally", 1.0),
    "Thursday" -> ("Alice", 1.0),
    "Friday" -> ("Bob", 1.5),
    "Saturday" -> ("Scally", 2.0),
    "Sunday" -> ("Scally", 2.0)
  )

  val key = scala.io.StdIn.readLine()
  val tuple = dutySchedule(key)
  println("On " + key + " " + tuple._1 + " on duty, will get " + tuple._2 + " day-offs")
}
