/*
                        ** EXCEPTION HANDLING **

* Exception adalah kejadian yang dapat mengacaukan jalannya suatu program.
* Fungsi Exception Handling adalah menangani suatu Exception tersebut.

* Pada Kotlin semua exception bersifat Unchecked, yang artinya exception
terjadi karena kesalahan pada kode kita.
* Macam-macam Unhecked Exception :
        ArithmaticException -> Membagi suatu bilangan dengan nilai 0.
        NumberFormatException -> Kesalahan dalam format angka.
        NullPointerException -> Sebuah variabel atau objek memiliki nilai null
        padahal seharusnya variabel atau objek tsb tidak boleh bernilai null.
 */

// main function
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

    // LATIHAN
    val a: String? = null
    var someA: String
    try {
        someA = a!!
        println(someA)
    } catch (e: Exception) {
        someA = "Nilai String tidak boleh null!"
        println(someA)
    }

    val c: Int? = null
    val someC: Int
    try {
        someC = c!! // Penyebab NullPointerException
        println(someC)
    } catch (e: Exception) {
        println("Nilai tidak boleh null")
    }
}

/*
                    ** Exception Handling dengan "try-catch" **

* Konsep : Kode yang dapat membangkitkan suatu exception disimpan dalam blok try,
jika exception tersebut terjadi, maka blok catch akan terpanggil.

                try {
                    // Block try, menyimpan kode yang membangkitkan exception
                } catch (e: SomeException) {
                    // Block catch akan terpanggil ketika exception bangkit.
                }


 */