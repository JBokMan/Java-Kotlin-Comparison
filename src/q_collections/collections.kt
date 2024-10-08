package q_collections

import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    println()
    // Operations on lists, sets, queues, and deques

    // Lists
    val list = listOf("a", "b", "c")
    println("list: $list")

    val mutableList = mutableListOf("a", "b", "c")
    println("mutableList: $mutableList")

    // Sets
    val set = setOf("a", "b", "c")
    println("set: $set")

    val mutableSet = mutableSetOf("a", "b", "c")
    println("mutableSet: $mutableSet")

    // Queues
    val queue: Queue<String> = LinkedList(listOf("a", "b", "c"))
    println("queue: $queue")
    // Deques
    val deque = ArrayDeque<String>(listOf("a", "b", "c"))
    println("deque: $deque")

    println()

    // Add an element or elements
    val newList = list.plus("d")
    println("list: $list")
    println("newList: $newList")

    mutableList.add("d")
    mutableList += "e"
    println("mutableList: $mutableList")

    val newSet = set.plus("d")
    set + "e"
    println("set: $set")
    println("newSet: $newSet")

    mutableSet.add("d")
    mutableSet += "e"
    println("mutableSet: $mutableSet")

    queue.add("d")
    queue += "e"
    println("queue $queue")

    deque.add("d")
    deque += "e"
    println("deque $deque")

    queue.addAll(listOf("f", "g"))

    println()


    // Check whether a collection contains an element or elements

    val contains = list.contains("a")
    println("list contains 'a': $contains")

    val contains2 = "a" in list
    println("list contains 'a': $contains2")

    println()


    // Check whether a collection is empty or not empty

    val empty = list.isEmpty()
    println("list is empty: $empty")

    val notEmpty = list.isNotEmpty()
    println("list is not empty: $notEmpty")

    println()


    // Remove under a certain condition
    mutableList.remove("a")
    println("mutableList after removing 'a': $mutableList")
    mutableList.removeIf { it == "b" }
    println("mutableList after removing 'b': $mutableList")

    println()


    // Leave only selected elements
    mutableList.retainAll(listOf("c"))
    println("mutableList after retaining 'c': $mutableList")

    println()

    // Remove all elements from a collection
    mutableList.clear()
    println("mutableList after clearing: $mutableList")

    println()


    // Get a stream from a collection
    val stream = list.stream()
    println("stream: $stream")
    list.map { println("map list, it: $it") }
    list.filter { it == "a" }.map { println("list map after filter it: $it") }

    println()

    // Get an iterator from a collection
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        println("iterator next: ${iterator.next()}")
    }

    // more: https://kotlinlang.org/docs/java-to-kotlin-collections-guide.html

    println()

    // Maps
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println("map: $map")

    val mutableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println("mutableMap: $mutableMap")

    mutableMap["d"] = 4
    mutableMap += "e" to 5
    println("mutableMap after adding 'd' and 'e': $mutableMap")

    val singleValue = map["a"]
    println("singleValue: $singleValue")

    val elementInMap = "a" in map
    println("elementInMap: $elementInMap")

    println()


    // Operations that differ a bit


    // Get flat access to nested collection elements
    val nestedList = listOf(listOf("a", "b"), listOf("c", "d"))
    val flatList = nestedList.flatten()

    println("nestedList: $nestedList")
    println("flatList: $flatList")
    nestedList.flatMap { it.map { println("flatMap it: $it") } }

    // Apply the given function to every element
    val foo = list.map { "new $it" }
    println("foo: $foo")

}