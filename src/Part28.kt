fun main() {
    Homework()
}

fun Homework() {
    var list = (1..10).toList()
    val sum = list.customSum{ it % 2 == 1}
    // 1 + 3 + 5 + 7 + 9 = 25
    println("The sum is: $sum ")
}

fun Exemplo1() {
    var list = (1..20).toList()
    println(list)
    //list = list.filter { it % 2 == 0 }
    list = list.filter { it > 8 }
    println(list)
}

fun Exemplo2() {
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    shapes = shapes.customFilter{ it.area() > 20.0}.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }
}

fun List<Int>.customSum(evalExpression: (Int) -> Boolean): Int {
    var acc = 0
    for (i in this) {
        if (evalExpression(i)) {
            acc += i
        }
    }
    return acc
}

fun List<Shape>.customFilter(filterFunction: (Shape) -> Boolean): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for(shape in this) {
        if(filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}