import java.lang.StringBuilder

// main function
fun main() {
    val text = "Hello" // Ini adalah konteks sebuah objek
    val result = text.run { // text adalah receiver type bernilai "Hello"
        val from = this // Cara mengakses konteks sebuah objek sebagai lambda receiver
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
    // Output : "result : replace text from Hello to Kotlin"

    val angka = 20
    val hasil = angka.run {
        val result = this * 40
        result
    }
    println(hasil)
}

/*
* Fungsi Run mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
* Fungsi Run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi
objek dan perhitungan untuk nilai kembalian.
 */


/*
* Untuk mengakses konteks sebuah objek dari dalam lambda
yang menjadi bagian dari scope function kita dapat
menggunakan "this" dan "it".

* Mengakses konteks sebuah objek sebagai lambda receiver -> "this".
fungsi run, with, apply.

* Mengakses konteks sebuah objek sebagai lambda argumen -> "it".
fungsi let dan also.
 */