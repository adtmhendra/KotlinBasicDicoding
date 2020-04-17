// main function
fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5) // 1 & 2 adalah angka duplikat
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB) // Output true

    println(5 in setA) // melakukan pengecekan dengan operator in. Output true

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union) // Output 1, 2, 4, 5, 7
    println(intersect) // Output 1, 5

    // Mutable Set
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    mutableSet.add(6)
    mutableSet.remove(6)
    println("Mutable Set : $mutableSet")
}

/*

* Fungsi setOf() berfungsi untuk menghapus duplikasi data
dalam sebuah Collections. setOf() akan secara otomatis membuang
data yang sama.

* Fungsi union : mengetahui gabungan dari 2 buah Set.
* Fungsi intersect : mengetahui irisan dari 2 buah Set.

* Pada Set kita dapat menambah dan menghapus data, tetapi
tidak dapat mengubah nilai.

 */