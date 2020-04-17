class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean = true)

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.2, 2)
    println(dicodingCat.name)
    dicodingCat.weight
    dicodingCat.age
    dicodingCat.isMammal
}
/*
* Tentunya, tidak semua properti dan fungsi pada sebuah kelas memiliki hak akses publik,
* Dengan menentukan hak akses (visibility modifier), kita dapat membatasi akses data pada sebuah kelas.

* Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.
Ketika sebuah anggota memiliki hak akses public maka anggota tersebut dapat diakses dari luar kelasnya melalui
sebuah objek kelas tersebut.

* Contohnya adalah sebuah kelas Animal dengan properti publik seperti name, age, weight dan isMammal.
Properti tersebut dapat kita akses dari luar kelas Animal. Dari completion suggestion terlihat bahwa properti
tersebut dapat kita akses di luar dari kelasnya.
 */