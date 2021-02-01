import kotlin.random.Random

class Rectangle(
    val a: Double,
    val b: Double
): Shape("Rectangle") {
    companion object {
        fun randomRectangle(): Rectangle {
            val randomSide = Random.nextDouble(1.0, 10.0)
            return Rectangle(side=randomSide)
        }
    }
    constructor(side: Double) : this(side, side)
    constructor(a: Int, b: Int): this(a.toDouble(), b.toDouble())

    init {
        println("$name created with a = $a and b = $b")
    }

    override fun area(): Double = a * b

    override fun perimeter(): Double = 2 * a + 2 * b

//    fun area() = a * b
//
//    fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}