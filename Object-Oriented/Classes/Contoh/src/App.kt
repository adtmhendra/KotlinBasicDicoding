class Animal(val name: String = "Buaya",
             val weight: Double,
             val age: Int,
             val isMammal: Boolean) {

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Manusia ( val nama: String,
                val usia: Int,
                val berat: Double,
                val omnivora: Boolean) {

    fun singing() {
        println("$nama sedang bernyanyi Zona Nyaman")
    }

    fun marah () {
        println("$nama sedang marah karena beratnya bertambah $berat kg")
    }

}
// main function
fun main() {
    val manusia = Manusia(berat = 70.5, nama = "Hendra Pratik Aditama", usia = 20, omnivora = true)
    println("Nama saya: ${manusia.nama}, Saya berusia: ${manusia.usia} tahun, Berat badan saya adalah ${manusia.berat} kg, " +
            "Omnivora: ${manusia.omnivora}\n" +
            "Hal yang saya lakukan saat ini adalah: ")
            manusia.singing()
            manusia.marah()

    println("")

    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}

/*
                                NOTEEEE!!!!!!!!
* CLASS : Merupakan sebuah Blueprint(kerangka/rancangan) yang di dalamnya terdapat
Properti (atribut) dan Fungsi (behaviour).

* PROPERTI : Karakteristik dari sebuah kelas, memiliki tipe data.

* FUNGSI : Kemampuan atau aksi dari sebuah kelas.


        Contoh Sederhana Perbedaan CLASS, PROPERTI, dan FUNGSI :
Class : Hewan.
Properti : Nama hewan, Jenis Hewan, Berat, Usia.
Fungsi : Bisa makan, Tidur, Berjalan, Berlari.

 */