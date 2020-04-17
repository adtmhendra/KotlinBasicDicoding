abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan!")
    }

    fun sleep(){
        println("$name sedang tidur!")
    }
}

fun main() {
    println("Abstract Class")
}

/*
* Abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek.
Animal (Hewan ) secara harfiah merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut.
Kita tahu bentuk kucing, ikan dan ular seperti apa, tetapi tidak untuk hewan.
Konsep Abstract class perlu diterapkan agar kelas Animal tidak dapat direalisasikan dalam bentuk objek
namun tetap dapat menurunkan sifatnya kepada child class-nya.

* Untuk menjadikan sebuah kelas Abstract, kita hanya perlu menambahkan keyword abstract sebelum menuliskan nama kelas
* Dengan begitu, kelas Animal tidak dapat kita inisialisasikan menjadi sebuah objek.
 */