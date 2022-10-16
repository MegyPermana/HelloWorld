//Latihan 1
//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val oddNumber = numberList.find {it % 2 == 1}
//    println(numberList)
//    println(oddNumber)
//}

//Latihan 2
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList.lastOrNull { it % 2 == 3 }

    println(oddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)
}
