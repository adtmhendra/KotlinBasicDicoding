val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }

// Fungsi yang memiliki 2 parameter Int dan tipe kembalian Int
// Function type pada kode dibawah adalah "(Int, Int) -> Int"
val multiply: (Int, Int) -> Int = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}

/*
* Ketika kita tidak ingin fungsi mengembalikan nilai,
kita wajib menuliskan "Unit" secara eksplisit.

* Lambda expression adalah salah satu cara untuk membuat instance
dari sebuah function type.

* Untuk menggunakan instancenya, kita bisa menggunakan
operator invoke() atau dapat menuliskannya langsung (tanpa
menggunakan) operator invoke().
cth : sum.invoke (20, 20) / sum (20,20)
 */