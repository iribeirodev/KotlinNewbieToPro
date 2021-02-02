//Kotlin Newbie to Pro - ANONYMOUS CLASSES - Part 26
fun main() {
    var a = 3.0
    var b = 4.0
    var height = 2.0

    val parallelogram = object: Shape(name = "Parallelogram", a, b, height) {

        init {
            println("Parallelogram created with a = $a, b = $b, height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b
    }

    println("Is the parallelogram a rectangle? ${parallelogram.isRectangle()}")
}