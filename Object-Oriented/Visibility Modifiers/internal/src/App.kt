internal class Animal(val name: String)

fun main() {
    println("internal visibility modifier")
    val cat = Animal("hahaha")
    println(cat.name)
}

/*
* Hak akses Internal digunakan untuk membatasi suatu anggota agar dapat diakses hanya pada satu modul.
* Hak akses ini sangat berguna ketika kita mengembangkan sebuah aplikasi yang memiliki beberapa modul
di dalamnya.
 */