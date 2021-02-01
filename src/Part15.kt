fun greet() {
    println("Where are you from?")
    val place = readLine()?.toLowerCase()
    when (place) {
        "usa" -> println("Hello")
        "germany" -> println("Hallo")
        "russia" -> println("privet")
        "india" -> println("Namaste")
        else -> println("I don't know that")
    }
}

fun main() {
    greet()
}

//fun main() {
//    val age = readLine()?.toInt()
//    when (age) {
//        in 0..5 -> println("You are a young kid")
//        in 6..10 -> println("You're a kid")
//        in 11..17 -> println("You're a teenager")
//        18 -> println("Finally you're 18")
//        19, 20 -> println("You're a young adult")
//        in 21..65 -> println("You're an adult")
//        else -> println("You're really old")
//    }
//}