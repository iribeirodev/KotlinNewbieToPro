import java.lang.NumberFormatException

//Kotlin Newbie to Pro - EXCEPTIONS - Part 27
fun main() {
    val division = try{
        divide(4.0, 0.0)
    } catch(e: DivisionByZeroException) {
        0.0
    }

    println("The result of the division is $division")

    println("Please enter a number: ")
    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException) {
        0
    } finally {
        println("This is from the finally block")
    }

    println("Value: $input")
}

class DivisionByZeroException: Exception("You cannot divide by zero, choose a valid number")

fun divide(a: Double, b: Double): Double {
    if (b == 0.0)
        throw DivisionByZeroException()
    return a / b
}