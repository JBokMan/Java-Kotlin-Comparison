package o_arrays

fun main(args: Array<String>) {
    val array0 = arrayOf(1, 2, 3)
    val array1 = arrayOf("1", "2", "3")
    val array11 = intArrayOf(1, 2, 3) // better performance than arrayOf<Int>
    val array2 = arrayOfNulls<Int>(3)
    val array3 = emptyArray<Int>()
    val array4 = Array(size = 10, init = { i -> i * 2 })

    println(array0.joinToString())
    println(array1.joinToString())
    println(array2.joinToString())
    println(array3.joinToString())
    println(array4.joinToString())

    println(array1[0])
    println(array1[1])

    array1[0] = "4"

    println(array1[0])


    val nestedArray: Array<Array<Int>> = Array(3) { Array(3) { it } }
    val nestedArray2: Array<Array<Int>> = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    println(nestedArray.contentDeepToString())
    println(nestedArray2.contentDeepToString())
    println(nestedArray2[1][2])
}
