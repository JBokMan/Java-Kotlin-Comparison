package n_generics

fun main(args: Array<String>) {
    val box: Box<Int> = Box(1)
    val box2: Box<String> = Box("Hello")
    val box3 = Box(1) // 1 has type Int, so the compiler figures out that it is Box<Int>

    println(box.value)
    println(box2.value)
    println(box3.value)
}

class Box<T>(t: T) {
    val value = t
}
