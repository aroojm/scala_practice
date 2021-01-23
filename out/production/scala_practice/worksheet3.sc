/*
 BabylonianSquareRoot
 program outputs square root of 207936 with help of the Babylonian method.
 */


  def sqrt(r: Int, x: Int = 1): Int = {
    if (x * x != r)
      sqrt(r, (x + (r / x)) / 2)
    else
      x
  }
  println(sqrt(207936))
