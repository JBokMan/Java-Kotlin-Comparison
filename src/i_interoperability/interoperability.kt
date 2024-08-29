package i_interoperability

import h_classes.JavaUserRecord
import h_classes.JavaUserRegularClass

fun main(args: Array<String>) {
    val javaUserRecord = JavaUserRecord("Alice", "+49-012345678910")
    println(javaUserRecord.name)
    println(javaUserRecord.phoneNumber)

    val javaUserRegularClass = JavaUserRegularClass("Bob", "+49-012345678911")
    javaUserRegularClass.printUser()
}
