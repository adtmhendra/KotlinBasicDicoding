// main function
fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    /*
    "Kalau message == null maka let (lewatkan), kalau message != null
     maka message.length * 2"
    */

    // Tanpa menggunakan fungsi let
    val pesan: String? = null
    println("text length ${pesan ?. length ?: 0 * 2}")

    // Menjalankan logika kode lain jika objeknya bernilai null
    val  nama: String? = null
    nama?.let {
        println("text length : ${it . length * 2}")
    }.run {
        println("nama tidak ada. silahkan isi!")
    }
}

/*
* Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
* Fungsi let akan banyak ditemukan pada objek yang bertipe non-null.
* Fungsi let dapat mengurangi penggunaan safe call operator.
 */