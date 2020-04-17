// main function
fun main() {
    val someNullValue: String? = "hendra"
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!! // Penyebab NullPointerException
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}

/*
                 ** Exception Handling dengan "try-catch-finally" **
* finally akan dieksekusi setelah program keluar dari blok try ataupun catch,
juga tereksekusi ketika terjadi exception yang tidak terduga.

* Exception tidak terduga terjadi ketika kita menggunakan NullPointerException
pada catch namun exception yang terjadi adalah NumberFormatException.
 */