/* a program  to output the first 5 Fibonacci numbers,
   each on a new line.
 */

val a = 0
val b = 1
def sum(x: Int, y: Int): Int = x + y

println(a)
println(b)
println(sum(a, b))
println(sum(b, sum(a, b)))
println(sum(sum(a, b), sum(b, sum(a, b))))