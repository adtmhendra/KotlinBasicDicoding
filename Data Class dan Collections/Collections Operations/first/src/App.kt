// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.first { it < 10 }
    println(moreThan10)

    println(numberList.first { it > 5 }) // Output 6
    println(numberList.last { it < 5 }) // Output 4
}

/*
* Fungsi .first() digunakan untuk menyaring data pertama
dari sebuah Collections.

* Fungsi .last() digunakan untuk menyaring data terakhir
dari sebuah Collections.

* Kita juga dapat menambahkan kondisi dengan parameter lambda
setelah kedua fungsi tersebut.

* "it" merepresentasikan masing masing item pada numberList.
 */