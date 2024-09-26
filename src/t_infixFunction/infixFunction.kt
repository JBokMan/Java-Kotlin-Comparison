package t_infixFunction

import javax.swing.text.BoxView


class foo {
    // Function with one parameter
    infix fun bar(baz: Int) {
        println("Infix function with one parameter: $baz")
    }
}

class interactor{
    // Function with one parameter
    infix fun clicks(aView: BoxView) {
        println("Infix function with one parameter: $aView")
    }
}

fun main(args: Array<String>) {
    val a : Boolean = true
    val b : Boolean = false

    println(a or b)
    println(a xor b)
    println(a and b)


    val foo = foo()
    foo bar 5

    val interactor = interactor()
    val aView = BoxView(null, 0)

    interactor clicks aView
}