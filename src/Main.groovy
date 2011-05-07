import Square

def name = "Matthew"
int programmingPoints = 10

println "Hello ${name}"
println "${name} has at least ${programmingPoints} programming points."
println "${programmingPoints} squared is ${Square.square(programmingPoints)}"
println "${programmingPoints} minus 7 bonus points is ${Subtract.subtract(programmingPoints, 7)}"
println "${programmingPoints} plus 3 bonus points is ${Sum.sum(programmingPoints, 3)}"