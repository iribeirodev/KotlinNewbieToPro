//open class Shape(
abstract class Shape(
    var name: String
) {
    init {
        println("I am the super class.")
    }

    // You dont know the implementation,
    // but you know derived classes need to implement that.
    abstract fun area(): Double
    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}