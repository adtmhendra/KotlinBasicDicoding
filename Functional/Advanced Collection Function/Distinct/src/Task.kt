fun main() {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    // Fungsi distinct() dalam tipe data class
    data class Item(val key: String, val value: String)
    val items = listOf(
            Item("1", "Hendra"),
            Item("2", "Pratik"),
            Item("3", "Aditama"),
            Item("3", "Hendra"),
            Item("3", "Pratik")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    // Penyaringan menggunakan distinctBy()
    val text = listOf("A", "BB", "CCC", "DDD", "EE")
    val distinctBy = text.distinctBy {
        it.length
    }
    println(distinctBy)



    // FUNGSI chunked()
    val word = "HENDRA"

    val result = word.chunked(2)
    println(result)
    val hasil = word.chunked(3) {
        it.toString().toLowerCase() // Mengubah nilai ke lowerCase
    }
    println(hasil)



}

/*
* Fungsi distinct() digunakan untuk menyaring item yang sama dalam sebuah collection.

* Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class.

* Kita bisa menentukan proses penyaringan item yang sama seperti apa yang akan dijalankan
dengan menggunakan fungsi distinctBy()

*
 */

/*
* Fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
 */