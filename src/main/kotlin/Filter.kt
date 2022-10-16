//~ filter and filterNot
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val eventList = numberList.filter { it % 2 == 0 } // [2, 4]
    val notEventList = numberList.filterNot { it % 2 == 0 } // [1, 3, 5]

    println(numberList)
    println(eventList)
    println(notEventList)
}