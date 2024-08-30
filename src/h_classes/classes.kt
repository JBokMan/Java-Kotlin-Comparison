package h_classes

fun main(args: Array<String>) {
    val user = KotlinUserDataClass(name = "Alice", phoneNumber = "+49-012345678910")
    println(user.name)
    println(user.phoneNumber)

    val user2 = KotlinUserRegularClass(name = "Bob", phoneNumber = "+49-012345678911")
    user2.printUser()
}
