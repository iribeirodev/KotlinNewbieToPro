fun reverseOrder() {
    val list = mutableListOf<Int>()
    println("Please enter 5 numbers")
    for (i in 1..5) {
        var num = readLine()?.toInt()
        if (num != null) list.add(num)
    }

    println("The 5 numbers in reverse order are:")
    for (i in 4 downTo 0) {
        println(list[i])
    }
}
//************************************************************************************
fun printFibonnaciSeries() {
    var list = mutableListOf<Int>()

    // Setting first and second elements
    var first = 0; var second = 1
    var sum = first + second
    list.add(first); list.add(second)

    // Getting user input
    println("Enter a number n > 1")
    var n = readLine()?.toInt()

    // Checking invalid input
    if (n != null) {
        if (n <= 1) {
            println("Invalid number")
            return
        }

        // Adding other n elements to fibonnaci series
        while (sum <= n) {
            list.add(sum)
            first = second
            second = sum
            sum = first + second
        }
    }

    print(list)
}

fun main() {
    //reverseOrder()
    printFibonnaciSeries()
}