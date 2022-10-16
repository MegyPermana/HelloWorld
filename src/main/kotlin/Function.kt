fun main() {
    val hasil = setUser("Budi",21)

    println(hasil) // --> Nama kamu adalah Budi, dan umur kamu 21 tahun
}

fun setUser(name: String, age: Int): String {
    return "Nama kamu adalah $name, dan umur kamu $age tahun"
}