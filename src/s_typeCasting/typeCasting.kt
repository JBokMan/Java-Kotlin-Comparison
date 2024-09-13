package s_typeCasting

fun main(args: Array<String>) {
    val num1: Number = 12.6
    val num2: Number = 42

    // explicit cast with function
    val int1 = num1.toInt()
    val int2 = num2.toInt()

    println("int1: $int1")
    println("int2: $int2")
    println()

    // explicit cast with operator
    val int3 = num1 as? Int
    //val int3 = num1 as Int //always fails due to
    //val double = num1 as Double
    val int4 = num2 as? Int

    println("int3: $int3")
    println("int4: $int4")
    println()

    // smart cast
    val int5 = convertToInt(num1)
    val int6 = convertToInt(num2)

    println("int5: $int5")
    println("int6: $int6")
    println()
}

fun convertToInt(num: Number): Int {
    return if (num is Int) {
        num
    } else {
        num.toInt()
    }
}

fun lengthIfString(a: Any): Int {
    if (a is String) {
        return a.length
    }
    return 0
}