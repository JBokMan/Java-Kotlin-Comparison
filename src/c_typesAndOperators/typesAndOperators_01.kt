package c_typesAndOperators

fun main(args: Array<String>) {
    val x = 1
    val y = 2

    println(x + y * 4 / 3)
    // output -> x = 3

    // here is another way to do the same job of the second calculation (x + y) * 4 / 3
    // Kotlin will take care about the order
    println(x.plus(y).times(4).div(3))
    // output -> x = 4
}
