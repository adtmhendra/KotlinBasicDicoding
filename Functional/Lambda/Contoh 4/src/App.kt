// main function
fun main() {
    printResult(20) {
        value -> value + value
    }

    pengurangan("Hello Kotlin ") {
        value -> value + value
    }
}

fun printResult(value: Int, jml: (Int) -> Int) {
    println(jml(value))
}

fun pengurangan (value: String, krg: (String) -> String) {
    println(krg(value))
}

/*
* Higher-Order Function == sebuah fungsi yang menggunakan fungsi
lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
 */