fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)

    val drop = number.drop(2) // Memangkas 2 item
    val dropLast = number.dropLast(3) // Memangkas 3 item dari indeks terakhir

    println(drop) // Output: 7, 8, 9
    println(dropLast) // Output: 1, 2, 3
}

/*
* Fungsi drop() adalah fungsi yang dapat memangkas item dalam sebuah objek collections
berdasarkan jumlah yang kita tentukan.

* Pada dasarnya, pemangkasan dimulai dari index pertama.

* Untuk pemangkasan yang dimulai dari index terakhir, kita bisa menggunakan fungsi dropLast().
 */