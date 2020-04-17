// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Akan menyaring data yang habis dibagi 2
    val evenList = numberList.filter { it % 2 == 0 }

    // Akan menyaring data yang tidak habis dibagi 2
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)

    val hasil = println(numberList.filterNot { it % 4 == 0 })
}

/*
* Fungsi .filter() digunakan untuk menyaring data dan
akan menghasilkan Collecions baru sesuai kondisi yang
kita berikan.

* Fungsi .filterNot() digunakan untuk memfilter list berdasarkan
hasil yang tidak sesuai dengan kondisi yang diberikan.

* "it" merepresentasikan masing masing item pada numberList.
 */