//~ ForLoop
//fun main() {
//    for (i in 1..7) {
//    println("Infinite Learning")}
//}

//fun main() {
//    for (i in 1..20){
//        println("Value is $i")
//    }
//}

//fun main() {
//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    for (day in days){
//        println(day)
//    }
//}

//~ ForLoop - withIndex()
//fun main() {
//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    for ((index, value) in days.withIndex()) {
//        println("value $value with index $index")
//    }
//}

//~ ForLoop - forEach
//fun main() {
//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    days.forEach { value ->
//        println("Day is $value")
//    }
//}

//~ ForLoop - forEachIndexed
fun main() {
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    days.forEachIndexed{index, value ->
    println("Day $value with index: $index")
    }
}