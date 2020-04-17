// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numberList.count()) // Output 10

    // Mencari total bilangan yang habis dibagi 3
    println(numberList.count { it % 3 == 0 }) // Output 3, yaitu item 3, 6, 9

    // Mencari total bilangan yang habis dibagi 2
    println(numberList.count { it % 2 == 0 }) // Output 5
}

/*
* Fungsi .count() digunakan untuk menghitung jumlah data
yang ada pada sebuah Collections.

* Kita juga dapat menambahkan kondisi dengan parameter lambda
setelah .count()

* "it" merepresentasikan masing masing item pada numberList.
 */