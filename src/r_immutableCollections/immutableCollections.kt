package r_immutableCollections

import kotlinx.collections.immutable.persistentListOf

//There are two families of collection interfaces in the Standard Library:
//
//read-only interfaces, which only allow to read elements from a collection: Collection, List, Set, Map;
//mutable interfaces, which additionally allow to modify elements in a collection: MutableCollection, MutableList,
// MutableSet, MutableMap.

//Kotlin mostly doesn't provide its own collection implementations: in Kotlin/JVM the collection interfaces are mapped to the
// standard JDK collection interfaces and implemented by the JDK collection implementations, such as ArrayList, HashSet,
// HashMap and other classes from java.util package.
//
//It is proposed to provide two families of interfaces that extend read-only collection interfaces:
//
//Immutable collections: ImmutableList, ImmutableSet, etc. They specify by their contract the real immutability
// of their implementors.
//
//Persistent collections: PersistentList, PersistentSet, etc. They extend immutable collections and provide efficient
// modification operations that return new instances of persistent collections with the modification applied. The returned
// collections can share parts of data structure with the original persistent collections.

fun main(args: Array<String>) {
    println()

    val persistentList = persistentListOf("a", "b")
    println("persistentList: $persistentList")

    val newPersistentList = persistentList.add("c")
    val otherNewPersistentList = persistentList + "d"

    println()
    println("persistentList: $persistentList")
    println("newPersistentList: $newPersistentList")
    println("otherNewPersistentList: $otherNewPersistentList")
}

