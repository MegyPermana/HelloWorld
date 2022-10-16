//~ Map
//fun main() {
//    val groupMap = mapOf(
//        1 to "Group 1",
//        2 to "Group 2",
//        3 to "Group 3",
//        4 to "Group 4",
//        5 to "Group 5",
//        6 to "Group 6",
//        7 to "Group 3",
//    )
//    println(groupMap)
//    println(groupMap[3])
//    println(groupMap.getValue(3))
//    println(groupMap.values)
//    println(groupMap.keys)

//~ toMutableMap
//fun main() {
//    val groupMap = mapOf(
//        1 to "Group 1",
//        2 to "Group 2",
//        3 to "Group 3",
//        4 to "Group 4",
//        5 to "Group 5",
//        6 to "Group 6",
//        7 to "Group 3",
//    )
//    println(groupMap)
//    val mutableGroupMap = groupMap.toMutableMap()
//    println(mutableGroupMap)
//    mutableGroupMap[1] = "Group Satu"
//    mutableGroupMap.put(8, "Group 8")
//    println(mutableGroupMap)
//}

//~ Map
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val multipliedBy5 = numberList.map { it * 5} // [5, 10, 15, 20, 25]
    print(multipliedBy5)
}
