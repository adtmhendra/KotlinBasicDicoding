
class Animal(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    var jenis: String

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
        this.jenis = "Pisces"
    }

    // Menambah properti isMammal
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean, jenis: String) : this(name, weight, age) {
        this.isMammal = isMammal
        this.jenis = jenis
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal("Dicoding tweet", 0.5, 1, true, "Aves")
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}, jenis: ${dicodingBird.jenis}")
}

/*
                                    Secondary Constructor
* Secondary Constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.
* Dengan Constructor, objek Animal dapat diinisialisasi dengan secondary constructor ketika nilai
name, weight, age dan isMammal tersedia.
 */