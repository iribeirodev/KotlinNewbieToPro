//Kotlin Newbie To Pro - WHILE LOOP - Part 12
fun main() {
    //countDown()
    exponent()
}

fun countDown() {
    println("Please enter a number")
    var cntInput = readLine()
    if (cntInput != null) {
        var cnt = cntInput.toInt()
        println("Lets count from 10 down to 0:")
        while (cnt >= 0) {
            println(cnt)
            cnt--
        }
    }
}
//*****************************************************
fun exponent() {
    println("Enter number 1:")
    var baseInput = readLine()
    println("Enter number 2:")
    var powInput = readLine()

    if (baseInput != null && powInput != null) {
        var cnt = 1; var result = 1
        while (cnt <= powInput.toInt()) {
            result *= baseInput.toInt()
            cnt++
        }
        println("$baseInput to the power of $powInput is $result")
    }
}