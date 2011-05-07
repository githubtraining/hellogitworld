def name = "Matthew"

println "Hello ${name}"

int programmingPoints = 10
println "${name} has at least ${programmingPoints} programming points."

println "${programmingPoints} squared is ${square(programmingPoints)}"

int square(int base) {
	base * base
}