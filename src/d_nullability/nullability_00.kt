package d_nullability

fun main(args: Array<String>) {
    // error
    // var x: Int = null
    // this would work !!
    var y: Int? = null

    // error
    // var firstname: String = null
    // this would work !!
    var lastname: String? = null

    // another example by allowing a list and the content to be nullable
    var list: List<String?> = listOf(null, null, null)
    var secondlist: List<String?> = listOf(null, "", "example")
    var thirdList: List<String>? = null
    // var fourthList: List<String?> = null
    // fourthList = listOf(null, null, null)
}
