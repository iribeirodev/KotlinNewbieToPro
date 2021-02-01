fun main() {
    val myCircle = Circle(5.0)
    myCircle.changeName("Peter")
    println("Circle ${myCircle.name}")

    val myTriangle = Triangle(2.0, 4.0)
    myTriangle.changeName("Susan")
    println("Triangle ${myTriangle.name}")
}