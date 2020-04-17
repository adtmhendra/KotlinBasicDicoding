class Animal {
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

/*
* Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat
sebuah Construktor secara manual.

* Ketika kita membuat sebuah objek, default konstruktor akan dipanggil. Construktor tersebut akan
menginisialisasi properti yang terdapat pada kelas dengan nilai default.
 */