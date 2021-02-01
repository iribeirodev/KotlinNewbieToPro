fun searchForValue(list: List<Int>, value: Int) {
    var i = list.indexOf(value)
    println("The index of $value is $i")
}

fun main() {
    var a = listOf<Int>(3, 2, 5, 1, 5, 6, 7)
    println("Search for this number:")
    var search = readLine()?.toInt()
    search?.let { searchForValue(a, search) }
}