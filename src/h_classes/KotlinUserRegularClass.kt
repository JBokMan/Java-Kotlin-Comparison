package h_classes

class KotlinUserRegularClass(private val name: String, private val phoneNumber: String) {
    fun printUser() {
        println("Name: $name")
        println("Phone Number: $phoneNumber")
    }
}
