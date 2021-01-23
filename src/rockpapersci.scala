/*
  implements the famous game Rock paper scissors.
  This is a game for two players where each selects "rock", "paper" or "scissors".
  Our program receives the players' choices as input lines:
  for the first player and for the second. If both select the same shape,
  the program prints draw , otherwise it prints who wins.
 */

object RockPaperScissors extends App {
  val gameMap = Map(
    "rock" -> Map(
      "paper" -> "second win",
      "rock" -> "draw",
      "scissors" -> "first win"
    ),
    "paper" -> Map(
      "rock" -> "first win",
      "paper" -> "draw",
      "scissors" -> "second win"
    ),
    "scissors" -> Map(
      "rock" -> "second win",
      "scissors" -> "draw",
      "paper" -> "first win"
    )
  )

  val list = List(scala.io.StdIn.readLine(), scala.io.StdIn.readLine())
  val set = Set(list(0), list(1))
  if (set.size == 1)
    println("draw")
  else {
    val firstMap = gameMap(list.head)
    println(firstMap(list.tail.head))
  }
}
