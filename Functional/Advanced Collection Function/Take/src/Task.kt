fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)

    val take = total.take(2) // Menyaring 2 item
    val takeLast = total.takeLast(3) // Menyaring 3 items pada indeks terakhir

    println(take)
    println(takeLast)
}

/*
* Fungsi take() digunakan untuk menyaring item yang berada dalam objek collections.

* Pada dasarnya, penyaringan dimulai dari index pertama.

* Untuk penyaringan yang dimulai dari index terakhir, kita bisa menggunakan fungsi takeLast().
 */