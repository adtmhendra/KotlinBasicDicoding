var message = "Kotlin"
var namaSaya = "Hendra"

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")
    println(::message.get())

    println(::namaSaya.get()) // Membaca nilai dari "namaSaya" dengan menggunakan get().
    ::namaSaya.set("Hendra Pratik Aditama") // Mengubah nilai "namaSaya" menggunakan set().
    println(::namaSaya.get()) // Membaca nilai "namaSaya" yang terbaru (setelah di set).
}

/*
* Operator "::" juga dapat digunakan untuk mereferensikan sebuah properti.

* kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama,
fungsi setter getter, dll.

*
 */