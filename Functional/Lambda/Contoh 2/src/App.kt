// main function
fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")

    length("Hello From lambda")

    println(kata("Hello From lambda"))
}

val messageLength = { message: String -> message.length }

val length = { message: String -> println("Message Length ${message.length}") }

fun kata (message: String): Int { // Perbedaan menggunakan fungsi
    return message.length         // dan Lambda
}

/*
* Untuk membedakan parameter dengan body, daftar parameter
yang ada dipisahkan oleh tanda "->"

* "message: String" adalah parameter, setelah tanda "->"
adalah body Lambda.

* kompiler akan mengembalikan nilai berdasarkan expression
atau statement di baris terakhir di dalam body Lambda.
 */