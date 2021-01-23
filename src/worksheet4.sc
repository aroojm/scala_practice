/*
  output the first 20 Fibonacci numbers,
  each on a new line.
 */

def printNumber(x : Int, y : Int, count: Int): Unit =
  if (count > 0) {
    println(x)
    printNumber(y, x+y, count - 1)
  }

printNumber(0, 1, 20)