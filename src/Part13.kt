//Kotlin Newbie To Pro - FOR LOOP - Part 13
fun sumOfArray() {
    var sum = 0
    var arr = arrayOf(2, 3, 5, 10, 14, 4)
    for (i in arr) sum += i

    println("The sum of the array is $sum")
}

fun average() {
    println("Enter 5 numbers")
    var sum = 0F
    for (i in 1..5) {

        var current = Integer.valueOf(readLine())
        sum += current
    }
    println("The average value is ${sum / 5}")
}


fun main() {
//    val myArray = arrayOf(1, 2, 3)
//    for (i in myArray) {
//        println(i)
//    }

//    for (i in 1..3) {
//        println(i)
//    }

//    for (i in 10 downTo 5 step 2) {
//        println(i)
//    }

//    for (i in 'a'..'z') {
//        println(i)
//    }

//    val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
//    var max = myArray[0]
//    for (item in myArray) {
//        if(item > max) {
//            max = item
//        }
//    }
//    println(max)
//    sumOfArray()
    average()
}