class User

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    // Collections List dapat menampung berbagai tipe data yang berbeda
    val anyList = listOf('a', "Kotlin", 3, true, User())

    println(anyList[3]) // Outputnya adalah true
    println(numberList)
    println(charList)

    // Contoh penggunaan mutableListOf (data yang dapat diubah)
    val mutableList = mutableListOf("Hendra", 'H', 20, true, User())
    println("Sebelum diubah : $mutableList")

    mutableList.add("Pratik") // Menambah data di akhir List
    mutableList.add(3, false) // menambah data pada index ke-3
    mutableList[1] = 'P' // Mengubah data pada index ke-1
    mutableList.removeAt(5) // Menghapus data User
    println("Sesudah diubah : $mutableList")
}

/*
NOTE !!!!

* Dengan menggunakan fungsi listOf() kita tidak dapat mengubah data yang
sudah ada seperti menghapus, menambah, serta mengganti. karena pada
dasarnya List bersifat immutable (tidak dapat diubah).

* Dengan fungsi mutableListOf() memungkinkan kita untuk dapat mengubah
data yang sudah ada misal menghapus, menambah, serta mengganti.
 */