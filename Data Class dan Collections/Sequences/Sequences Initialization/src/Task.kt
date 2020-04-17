fun main() {
    val list = (1..100).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
    // Item 1 - 4 langsung dilewatkan karena tidak memenuhi kondisi pada fungsi .filter()
    /*
     Operasi pada item 5 dilanjutkan ke fungsi .map() karena memenuhi kondisi pada fungsi
     .filter()
     */

}

/*
* Fungsi Sequence() melakukan operasi secara vertikal/per item.
Sequence akan langsung melakukan operasi pada item yang memenuhi kondisi
dan melanjutkan ke operasi berikutnya.
jika kondisi tidak terpenuhi, maka operasi tidak akan dilanjutkan.

* Fungsi Sequence() digunakan untuk data yang berjumlah ratusan ribu - jutaan.
 */