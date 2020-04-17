// main function
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(result)

    val jumlahSodara = 5
    val hasil = with(jumlahSodara) {
        val a = this * 50
        val b = a / 10
        "Hasilnya adalah $b"
    }
    println(hasil)
}

/*
* Fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa,
konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.

* Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya
tanpa harus menyediakan nilai kembalian.
 */