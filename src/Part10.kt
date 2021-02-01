// Kotlin Newbie To Pro - NULL VALUES AND USER INPUT - Part 10
fun main() {
    print("Please enter your age: ")
    val ageInput = readLine()

    if (ageInput != null) {
        val age = ageInput.toInt()
        when {
            age >= 65 -> println("You are really really old")
            age < 18 -> println("You are not an adult yet")
            else -> println("You are an adult")
        }
    }
}