package d_nullability

fun main(args: Array<String>) {
    val result1 = getLengthWithImplicitCheck("Hello")
    //val result2 = getLengthWithImplicitCheck(null)
    val result3 = getLengthWithExplicitCheck("Hello")
    //val result4 = getLengthWithExplicitCheck(null)

    println("\n$result1")
    //println("$result2")
    println("$result3")
    //println("$result4")
}

fun getLengthWithImplicitCheck(arg: String): Int {
    return arg.length
}

fun getLengthWithExplicitCheck(arg: String): Int {
    return arg.length
}

fun earlyReturnWithNullCheck1(arg: String?): Int {
    if (arg == null) {
        return 0
    }
    return arg.length
}

fun earlyReturnWithNullCheck2(arg: String?): Int {
    val nonNullArg = arg ?: return 0
    return nonNullArg.length
}

fun earlyReturnWithNullCheck3(arg: String?): Int {
    return if (arg == null) {
        0
    } else {
        arg.length
    }
}

fun earlyReturnWithNullCheck4(arg: String?): Int {
    return arg?.length ?: 0
}

fun ifAsExpression1(arg: String?): Int {
    val length = if (arg != null) {
        arg.length
    } else {
        0
    }
    return length
}

// Do not use!
fun banksOfShame(arg: String?): Int {
    check(arg != null, { "arg must not be null" })
    return arg.length
}
