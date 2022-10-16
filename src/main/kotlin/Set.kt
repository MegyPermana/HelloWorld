//~ setOf
//fun main() {
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setB = setOf(1, 2, 4, 5)
//    println(setA == setB) // true
//}

//~ Check value exist in Set
//fun main() {
//    val setData = setOf(1, 2, 4, 2, 1, 5)
//    println(4 in setData) // true
//}

//~ Union and Intersect
//fun main() {
//    val list1 = listOf(1, 1, 2, 3, 5, 8, -1)
//    val list2 = setOf(1, 1, 2, 2, 3, 5)
//    val list3 = mutableSetOf(6, 7)
//
//    val intersect = list1 intersect list2
//    val union = list1 union list2 union list3
//
//    println(intersect) // Will display the same data
//    println(union) // Merge data and eliminate duplicates
//}

//~ mutableSetOf
fun main() {
    val setItems = mutableSetOf(1, 2, 3, 5, 1, 4)
    // setItems[2] = 7 // can't change immutable set
    setItems.add(6) // add items at the end of the set
    setItems.remove(2) // remove items that have a value of 2

    println(setItems)
}