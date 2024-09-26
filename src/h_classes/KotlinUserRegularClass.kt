package h_classes

class KotlinUserRegularClass(private val name: String, private val phoneNumber: String) {
    fun printUser() {
        println("Name: $name")
        println("Phone Number: $phoneNumber")
    }

    fun validOverloadedFunction(foo: String) {
        println("Overloaded function with one parameter: $foo")
    }

    fun validOverloadedFunction(foo: Int) {
        println("Overloaded function with one parameter: $foo")
    }

    /*
    fun invalidOverloadedFunctionOtherReturn(foo: String): String {
        println("Overloaded function with one parameter: $foo")
        return foo
    }

    fun invalidOverloadedFunctionOtherReturn(foo: String): Int {
        println("Overloaded function with one parameter: $foo")
        return foo.length
    }
    */

    fun overloadedFunctionAmbiguityDefaultParameter(foo: String) {
        println("Overloaded function with one parameter: $foo")
    }

    fun overloadedFunctionAmbiguityDefaultParameter(foo: String, bar: Int = 0) {
        println("Overloaded function with two parameters: $foo and $bar")
    }

    fun overloadedFunctionSuperTypeParameter(foo: String) {
        println("Overloaded function with one parameter: $foo")
    }

    fun overloadedFunctionSuperTypeParameter(foo: Any) {
        println("Overloaded function with one parameter: $foo")
    }
}
