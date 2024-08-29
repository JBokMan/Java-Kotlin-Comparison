package e_defaultValues

fun main(args: Array<String>) {
    call()
    call(2)
}

fun call(arg: Int = 1) {
    println(arg)
}
