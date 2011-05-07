import static Square.square
import static Sum.sum

def name = "Matthew"
int programmingPoints = 10

println "Hello ${name}"
println "${name} has at least ${programmingPoints} programming points."
println "${programmingPoints} squared is ${square(programmingPoints)}"
println "${programmingPoints} plus 3 bonus points is ${sum(programmingPoints, 3)}"