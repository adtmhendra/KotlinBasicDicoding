class Animal(private var name: String,
             private val weight: Double,
             private var age: Int,
             private val isMammal: Boolean) {

    // Fungsi getName() bertujuan untuk mengembalikan nilai name yang memiliki tipe data String.
    fun getName() = name

    // setName() bertujuan untuk mengubah nilai properti name dengan nilai baru.
    // Fungsi setName() membutuhkan satu parameter bertipe String yang nantinya
    // akan dimasukkan nilainya ke dalam properti name.
    fun setName(newName: String) {
        name = newName
    }

    fun getAge() = age
    fun setAge(newAge: Int) {
        age = newAge
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2, true)

    // dicoding.name <- Cannot access '[PROPERTY]': it is private in 'Animal'
    println(dicodingCat.getName()) // Mengeprint properti Name
    dicodingCat.setName("Gooose") // Mengubah Properti Name
    println(dicodingCat.getName()) // Mengeprint properti Name yang telah diubah

    // Properti Age
    println(dicodingCat.getAge())
    dicodingCat.setAge(20)
    println(dicodingCat.getAge())
}

/*
* Untuk menggunakan modifier private kita perlu menambahkan keyword "private".
* Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
* Dengan menggunakan hak akses private, kita tidak diizinkan untuk mengakses properti pada kelas Animal tersebut  dari luar kelasnya.
* Cara untuk mengakses properti private dari sebuah kelas adalah dengan menambahkan fungsi getter() dan setter() secara manual
karena fungsi getter() dan setter() hanya dihasilkan secara otomatis oleh kotlin ketika sebuah properti memiliki hak akses public.
 */