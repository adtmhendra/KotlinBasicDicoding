// main function
fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(ascendingSort)
    println(descendingSort)

    val nama = listOf('H', 'E', 'N', 'D', 'R', 'A')
    println(nama.sorted())
    println(nama.sortedDescending())

    val angka = listOf(123, 242, 236, 789, 523, 506)
    println(angka.sorted())
    println(angka.sortedDescending())

}

/*
* Fungsi .sorted() digunakan untuk mengurutkan data secara ascending

* Fungsi .sortedDescending digunakan untuk mengurutkan data secara descending
 */