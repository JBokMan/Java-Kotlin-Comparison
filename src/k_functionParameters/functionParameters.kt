package k_functionParameters

fun main(args: Array<String>) {
    val function1: (String) -> Int = { arg: String -> arg.length }
    val function2: () -> Int = { 42 }
    val function3: () -> Unit = { println("Hello") }
    val function4: (Any) -> Unit = { arg: Any -> println(arg) }

    callFunction(lengthFunction = function1, printFunction = function4)
}

fun callFunction(lengthFunction: (String) -> Int, printFunction: (Any) -> Unit) {
    val length = lengthFunction("Hello")
    printFunction(length)
}
