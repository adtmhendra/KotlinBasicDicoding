// main function
fun main() {
    printMessage("Hello From Lambda")
    message()
}

val message = { println("Hello Kotlin!") }

// Lambda dengan parameter.
val printMessage = { message: String -> println(message) }

/*
* Lambda/function literal adalah sebuah fungsi yang juga memiliki
parameter, body, serta return type.

                    *Karakteristik Lambda*
* Kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembalian.
* Tidak membutuhkan kata kunci "fun" dan visibility modifier
(tingkatan akses. cth: private, public) saat dideklarasikan.
* Parameter berada di dalam kurung kurawal "{}".
* Kata kunci return tidak diperlukan lagi karena kompiler akan secara
otomatis mengembalikan nilai dari dalam body.
* Dapat digunakan sebagai argumen untuk sebuah parameter dan dapat
disimpan ke dalam sebuah variabel.
 */