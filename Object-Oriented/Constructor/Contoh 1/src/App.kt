class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) // Primary Constructor

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

/*
                        Primary Constructor
* Kita haruskan mengirim nilai sesuai properti yang dibutuhkan.
* Penulisan primary constructor mirip seperti parameter pada fungsi.
* Properti cukup dituliskan pada header class diawali dengan var atau val.
* Primary constructor juga dapat memiliki nilai default.
Contoh: pada materi sebelum ini, yaitu class Animal.
 */