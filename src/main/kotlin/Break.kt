//fun main() {
//    val c = 2
//    for (b in 1..10) {
//        println("Sayang...")
//        if(b == c){
//            println("Putus!")
//            break
//        }
//    }
//}

fun main() {
    var i = 0
    while (true) {
        println("Break $i")
        i++
        if (i > 500) {
            break
        }
    }
}