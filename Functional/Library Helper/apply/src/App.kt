// type your solution here

fun main() {
    val message = StringBuilder().apply {
        append("Hello ")    // Nilai konteks objek = "Hello"
        append("Kotlin!")   // Objek konteks = "append"
    }
    println(message.toString())
}

/*
* Nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya
dan objek konteksnya tersedia sebagai receiver (this).

* Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
 */