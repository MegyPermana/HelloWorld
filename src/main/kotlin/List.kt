//~ listOf()
//fun main() {
//    val numberList = listOf("One", "Two", "Tree")
//    println(numberList)
//}

//~ mutableListOf()
//fun main() {
//    val numberList = mutableListOf(1, 2, 3)
//    println(numberList)
//}

//fun main() {
//    val numberList = mutableListOf("One", "Two", "Tree")
//    println(numberList)
//    numberList[0] = "Satu" // Type mismatch: inferred type is String but Int was expected
//    println(numberList)
//}

//~ listAny
fun main() {
    val numberList = mutableListOf(false, "One", 2, 3.5)
    println(numberList)
    numberList.remove(false)
    numberList.set(0, 1)
    numberList[2] = 3
    numberList.add(3, 4)
    println(numberList)
}

