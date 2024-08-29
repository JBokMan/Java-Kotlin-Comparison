package g_compactFunctions

fun main(args: Array<String>) {
    callUser()
    println("My favorite number is ${getMyFavNumber()}")
    println("Am I cool? ${isCool()}")

    val myFavNumber = 12
    val divideNumberByTwo = { number: Int -> number / 2 }

    println("Divide my favorite number by 2: ${divideNumberByTwo(myFavNumber)}")
}

fun callUser() = println("I am calling the user...")

fun getMyFavNumber() = 12

fun isCool() = true
