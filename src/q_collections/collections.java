//package q_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("preview")
void main() {
    System.out.println();
    // Operations on lists, sets, queues, and deques

    // Lists
    List<String> list = List.of("a", "b", "c");
    System.out.println(STR."list: \{list}");

    List<String> mutableList = new ArrayList<>(List.of("a", "b", "c"));
    System.out.println(STR."mutableList: \{mutableList}");

    // Sets
    Set<String> set = Set.of("a", "b", "c");
    System.out.println(STR."set: \{set}");

    Set<String> mutableSet = new HashSet<>(Set.of("a", "b", "c"));
    System.out.println(STR."mutableSet: \{mutableSet}");

    // Queues
    Queue<String> queue = new LinkedList<>(List.of("a", "b", "c"));
    System.out.println(STR."queue: \{queue}");

    // Deques
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));
    System.out.println(STR."deque: \{deque}");

    System.out.println();

    // Add an element or elements
    //list.add("d");  UnsupportedOperationException
    //list.add("e"); UnsupportedOperationException
    System.out.println(STR."list: \{list}");

    mutableList.add("d");
    mutableList.add("e");
    System.out.println(STR."mutableList: \{mutableList}");

    //set.add("d"); UnsupportedOperationException
    //set.add("e"); UnsupportedOperationException
    System.out.println(STR."set: \{set}");

    mutableSet.add("d");
    mutableSet.add("e");
    System.out.println(STR."mutableSet: \{mutableSet}");

    queue.add("d");
    queue.add("e");
    System.out.println(STR."queue: \{queue}");

    deque.add("d");
    deque.add("e");
    System.out.println(STR."deque: \{deque}");

    queue.addAll(List.of("f", "g"));

    System.out.println();

    // Check whether a collection contains an element or elements
    boolean contains = list.contains("a");
    System.out.println(STR."list contains 'a': \{contains}");

    boolean contains2 = list.contains("a");
    System.out.println(STR."list contains 'a': \{contains2}");

    System.out.println();

    // Check whether a collection is empty or not empty
    boolean empty = list.isEmpty();
    System.out.println(STR."list is empty: \{empty}");

    boolean notEmpty = !list.isEmpty();
    System.out.println(STR."list is not empty: \{notEmpty}");

    System.out.println();

    // Remove under a certain condition
    mutableList.remove("a");
    System.out.println(STR."mutableList after removing 'a': \{mutableList}");
    mutableList.removeIf(it -> it.equals("b"));
    System.out.println(STR."mutableList after removing 'b': \{mutableList}");

    System.out.println();

    // Leave only selected elements
    mutableList.retainAll(List.of("c"));
    System.out.println(STR."mutableList after retaining 'c': \{mutableList}");

    System.out.println();

    // Remove all elements from a collection
    mutableList.clear();
    System.out.println(STR."mutableList after clearing: \{mutableList}");

    System.out.println();

    // Get a stream from a collection
    list.forEach(it -> System.out.println(STR."map list, it: \{it}"));
    list.stream().filter(it -> it.equals("a")).forEach(it -> System.out.println(STR."list map after filter it: \{it}"));

    System.out.println();

    // Get an iterator from a collection
    for (String s : list) {
        System.out.println(STR."iterator next: \{s}");
    }

    System.out.println();

    // Maps
    Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
    System.out.println(STR."map: \{map}");

    Map<String, Integer> mutableMap = new HashMap<>(Map.of("a", 1, "b", 2, "c", 3));
    System.out.println(STR."mutableMap: \{mutableMap}");

    mutableMap.put("d", 4);
    mutableMap.put("e", 5);
    System.out.println(STR."mutableMap after adding 'd' and 'e': \{mutableMap}");

    Integer singleValue = map.get("a");
    System.out.println(STR."singleValue: \{singleValue}");

    boolean elementInMap = map.containsKey("a");
    System.out.println(STR."elementInMap: \{elementInMap}");

    System.out.println();

    // Operations that differ a bit

    // Get flat access to nested collection elements
    List<List<String>> nestedList = List.of(List.of("a", "b"), List.of("c", "d"));
    List<String> flatList = nestedList.stream().flatMap(Collection::stream).toList();

    System.out.println(STR."nestedList: \{nestedList}");
    System.out.println(STR."flatList: \{flatList}");
    nestedList.forEach(innerList -> innerList.forEach(it -> System.out.println(STR."flatMap it: \{it}")));

    // Apply the given function to every element
    var foo = list.stream().map(it -> STR."new \{it}").collect(Collectors.toList());
    System.out.println(STR."foo: \{foo}");
}
