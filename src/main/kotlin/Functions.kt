import java.util.*

//~ User - Defined Functions
//fun main() {
//    printCompany ()
//}
//fun printCompany() {
//    println("Infinite Learning")
//}

//~ Function Parameters
//fun main() {
//    val color = "yellow"
//    turnOnLight(color)
//}
//fun turnOnLight(color:String) {
//    println("$color light is on")
//}

//~ Return Values
//fun main() {
//    val color = "yellow"
//    val lightOn = turnOnLight(color)
//    print(lightOn)
//}
//fun turnOnLight(color:String): String {
//    return "$color light is on"
//}

//~ Unit - Returning Functions
//fun main() {
//    sumTwo(3, 4)
//}
//fun sumTwo(a:Int, b:Int) {
//    val x = a + b
//    println(x)
//}

//~ Recursive Function
//~ Case 1 yang tidak pakai recursive function
//fun main() {
//    println(factorial(4))
//}
//fun factorial(n:Int): Int{
//    return if (n == 1) {
//        n
//    } else {
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
//    }
//}

//~ Case 2 yang pakai recursive function
//fun main() {
//    println(factorial(4))
//}
//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}

//~ Tail Recursion
//fun main() {
//    println(factorial(99999))
//}
//// Will get an error if not using tailrec
//// Error: Exception in thread "main" java.lang.StackOverflowError
//tailrec fun factorial(n: Int, result: Int = 1): Int {
//    val newResult= n * result
//    return if (n == 1) {
//        newResult
//    } else {
//        factorial(- 1, newResult)
//    }
//}

//~ Higher - Order Functions
//fun main() {
//    val result = calculate(4, 5, ::sum)
//    println(result)
//}
//fun sum(a: Int, b:Int) = a + b
//fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
//    return operation(a, b)
//}

//~ Lambda Function
//~ Case 1
//fun main() {
//    val upperCase = { str: String -> str.toUpperCase() }
//    println(upperCase("hello, world!"))
//}

//~ Case 2
//fun main() {
//   val upperCase = { str: String -> str.toUpperCase() }
//    println(upperCase("Infinite Learning"))
//}

//~ Inline Function
var balance = 10_000
fun main() {
    val playTheGame = {
        balance -= 1_000
        println("Playing the game!")
    }
    doTransaction(playTheGame)
}

inline fun doTransaction(doPlay:() -> Unit){
    println("Balance before play: $balance")
    doPlay()
    println("Balance after play: $balance")
}
