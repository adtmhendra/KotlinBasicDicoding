open class Animal(val name: String,
                  protected val weight: Double)

class Cat(pName: String, pWeight: Double, val skinColor: String) : Animal(pName, pWeight)


fun main() {
    val cat = Cat("Dicoding Miaw", 2.0, "Brown")
    println("Nama Kucing: ${cat.name}")
    println("Skin kucing ${cat.skinColor}")
    // println("Berat Kucing: ${cat.weight}") <- Cannot access 'weight': it is protected in 'Cat'
}

/*
* Hak akses Protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas
dapat diakses hanya oleh kelas yang merupakan turunannya.

* Properti weight pada kelas Animal memiliki hak akses protected.
Kita tetap bisa mengaksesnya dari kelas Cat yang termasuk dalam hirarki kelas Animal.
Namun kita tidak dapat mengakses properti tersebut secara langsung dari luar hirarki kelasnya.
 */