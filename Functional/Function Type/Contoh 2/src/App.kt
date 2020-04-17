typealias Arithmetic = (Int, Int) -> Int

// Penggunaan typealias Arithmetic pada fungsi sum
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}

/*
* Kita dapat menggunakan typealias untuk memberi nama alternatif
dari sebuah function type.

* Penulisan typealias
cth : typealias Arithmetic = (Int, Int) -> Int

* typealias digunakan untuk beberapa fungsi yang memiliki function type
yang sama.

* Dengan typeaslias, ketika kita memiliki function type yang panjang
kita bisa memberikan nama untuk sebuah function type tersebut serta
menggunakannya sebagai tipe untuk fungsi lainnya.
 */