fun main() {
    val groups = arrayOf<String>("Group 1", "Group 2", "Group 3", "Group 4")

    println( groups[0] )
    println( groups.get(1) )
    println( "-----------------" )

    groups[0] = "Group Satuu"
    groups.set(1, "Group Dua")

    println( groups[0] )
    println( groups.get(1) )
    println( groups.get(2) )
}