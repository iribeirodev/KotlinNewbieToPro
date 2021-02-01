//Kotlin Newbie to Pro - EXTENSION FUNCTIONS - Part 19
fun main() {
    var list = listOf(1, 2, 3, 4, 5, 6)
    print("The product of the list is: ${list.getProduct()}")
}


fun checkIfIsPrime() {
    println("Please enter a number")
    val input = readLine()?.toInt()

    if (input != null) {
        if (input.isPrime()) {
            println("$input is a prime number")
        } else {
            println("$input is not a prime number")
        }
    }
}

// Extension Functions
fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

fun List<Int>.getProduct(): Int {
    var result = 1
    for (item in this)
        result *= item

    return result
}



