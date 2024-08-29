package f_conditions


fun main(args: Array<String>) {
    println(check(0))
    println(check(5))
    println(check(6))
    println(check(9))
    println(check(10))
    println(check(20))
}

fun check(value: Int): Char {
    val result: Char = when (value) {
        in 0..4 -> 'a'
        5 -> 'b'
        6, 7, 8 -> 'c'
        9 -> 'd'
        in 10..20 -> 'e'
        else -> throw Error()
    }

    return result
}
