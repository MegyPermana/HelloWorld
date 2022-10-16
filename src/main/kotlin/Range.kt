//~ Range To
//fun main() {
//    val rangeInt = 1..10
//    println("Step: ${rangeInt.step}")
//    println(rangeInt.toList())
//}

//fun main() {
//    val rangeInt = 1.rangeTo(10)
//    println("Step: " + rangeInt.step)
//    print(rangeInt.toList())
//}

//~ Range Step
//fun main() {
//    val rangeInt = 1..10 step 2
//    println("Step: ${rangeInt.step}")
//    println(rangeInt.toList())
//}

//~ Range To() & downTo()
//fun main() {
//    var i = 4
//    if (i in 1.rangeTo(10)) {// equivalent of i >= 1 && i <=10
//        println("Value 4 available in Range")
//    }
//}

fun main() {
    var i = 20
    if (i !in 10.downTo(1)) {
        println("Value 4 is not available in Range")
    }
}