fun main() {
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val slice = total.slice(3..6)
    val sliceWithStep = total.slice(3..6 step 2)
    val sliceWithIndex = total.slice(index)

    println(slice) // Output: 4, 5, 6, 7
    println(sliceWithStep) // Output: 4, 6
    println(sliceWithIndex) // output: 3, 4, 6, 9

}

/*
* Fungsi slice() digunakan untuk menyaring item dari posisi tertentu.

* Fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan
untuk menentukan posisi pertama dan terakhir yang akan disaring.

* Kita juga bisa menggunakan operator step ketika argumennya disematkan

* Jika ingin menentukan posisi yang lebih spesifik, kita bisa mendefinisikannya
di dalam sebuah collection, kemudian disematkan sebagai argumen.
 */