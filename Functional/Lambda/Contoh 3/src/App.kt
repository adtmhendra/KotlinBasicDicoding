// main function
fun main() {
    printResult(20, sum) // Output: 20
}

// Deklarasi jika kita menggunakan Lambda sebagai argumen untuk fungsi lainnya
fun printResult(value: Int, sum: (Int) -> Int) {
    println(sum(value))
}

// Deklarasi jika kita ingin menetapkan sebuah fungsi memiliki 1 parameter
var sum: (Int) -> Int = { a: Int ->
    a + a }

/*
* Kita juga dapat menuliskan tipe kembalian pada Lambda secara eksplisit.
cth: val angka: (Int) -> Int = {value -> valueA + valueB}
 */