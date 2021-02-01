import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(
    val b: Double,
    val h: Double
) : Shape("Triangle") {
    init {
        println("$name created with b = $b, h = $h")
    }

    fun getArea(): Double = (b * h) / 2

    fun getPerimeter(): Double {
        var hyp = sqrt(b.pow(2.0) + h.pow(2.0))
        return b + h + hyp
    }
}