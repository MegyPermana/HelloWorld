//fun main() {
//    val timeClose = 8
//    val timeNow = 8
//    val isClosed = if(timeNow >= timeClose) "Class already closed" else "Class is open"
//    println(isClosed)
//}

fun main() {
    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if(timeNow >= timeClose) {
        "Class already closed"
    } else if(timeNow >= timeOpen) {
        "Class is open"
    } else {
        "Class is not open yet"
    }
    println(classStatus)
}
