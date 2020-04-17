class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)
class Manusia(var nama: String, var usia: Int, var jenisKelamin: String)

val Animal.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

val Manusia.getManusiaInfo : String
    get() = """
        Nama saya : ${this.nama}
        Usia saya : ${this.usia} tahun
        Jenis kelamin saya : ${this.jenisKelamin}
    """.trimIndent()

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)

    val sayaManusia = Manusia("Hendra Pratik Aditama", 20, "Laki-laki")
    println(sayaManusia.getManusiaInfo)
}

/*
* Pendeklarasian Extention properties sama seperti Extension function.
* Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah child class yang
mewarisi parent class.
* Extension properties dilakukan di luar kelas, sehingga Extension properties hanya
bisa di definisikan dengan fungsi getter() dan setter() secara eksplisit.
 */