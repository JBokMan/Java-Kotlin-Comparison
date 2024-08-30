package l_uncheckedExceptions

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    try {
        uncheckedException()
    } catch (e: Exception) {
        println("File not found")
    }
    //uncheckedException()
    //uncheckedExceptionWithAnnotation()
    //divideByZero()
}

private fun uncheckedException() {
    val file = File("not_existing_file.txt")
    val stream = FileInputStream(file)
}

@Throws(FileNotFoundException::class)
private fun uncheckedExceptionWithAnnotation() {
    val file = File("not_existing_file.txt")
    val stream = FileInputStream(file)
}

private fun divideByZero() {
    val numerator = 1
    val denominator = 0
    val result = numerator / denominator
}

/**
 * Conclusion
 * - Kotlin eliminates checked exceptions, reducing verbosity and boilerplate code.
 * - In Java, checked exceptions are declared and handled explicitly, while unchecked exceptions do not require explicit handling.
 * - Exception handling in Kotlin is unified, treating all exceptions as unchecked.
 * - When integrating Kotlin with Java, differences in exception handling paradigms may arise, requiring annotations like @Throws for compatibility.
 * - Both Java and Kotlin offer robust error handling mechanisms, ensuring software reliability.
 */