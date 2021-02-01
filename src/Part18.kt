fun main() {
//    val array = intArrayOf(10, 20, 25)
//    val max = getMax(1, 2, 7, 5, *array, 3)
//    println("The maximum value is $max")

//    searchFor("Developer")
//    searchFor("Developer", "Bing")
//    searchFor(search="Developer", engine="Bing")
    alternatingSum(3, 4, 5, 2, 1, 2, 3)
}

fun alternatingSum(vararg values: Int) {
    var result = 0
    var sum = true

    for (i in values) {
        if (sum) result += i
        else result -= i

        sum = !sum
    }
    println("The alternating sum is $result")
}


fun searchFor(search: String, engine: String = "Google") {
    println("Searching for $search on $engine")
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}