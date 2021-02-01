//Kotlin Newbie To Pro - FUNCTIONS AND PARAMETERS - Part 16
fun sumValues(n: Int) {
    var sum = 0
    for (i in 1..n) sum += i
    println("The sum of the values from 1 to $n is $sum")
}

fun main() {
    sumValues(8)
}