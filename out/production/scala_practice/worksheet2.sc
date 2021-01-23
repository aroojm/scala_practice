/*
 functions practice
 */
val pi = 3.14159
val radius = 5
def square(pi: Double, radius: Double ): Double = pi * radius * radius
def circumference(diameter: Int, pi: Double): Double = pi * diameter

println(square(pi, radius))
println(circumference(2*radius, pi))