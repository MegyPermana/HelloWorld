//~ Sorted Ascending
//fun main() {
//    val numberList = listOf(1, 3, 2, 6, 5, 4)
//    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')
//    val ascendingSort1 = numberList.sorted()
//    val ascendingSort2 = hackerChar.sorted()
//    println(ascendingSort1) // [1, 2, 3, 4, 5, 6]
//    println(ascendingSort2) // [a, c, e, h, k, r]
//}

//~ Sorted Descending
fun main() {
    val numberList = listOf(1, 3, 2, 6, 5, 4)
    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')
    val ascendingSort1 = numberList.sortedDescending()
    val ascendingSort2 = hackerChar.sortedDescending()
    println(ascendingSort1) // [6, 5, 4, 3, 2, 1]
    println(ascendingSort2) // [r, k, h, e, c, a]
}
