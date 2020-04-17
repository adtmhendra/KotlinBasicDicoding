// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    println(multipliedBy5)

    // Setiap data di dalam numberList dikalikan 2
    val hasil = println(numberList.map { it * 2 }) // Output 2, 4, 6, 8, 10, dst..
}

/*
* Fungsi .map() digunakan untuk membuat collection
baru sesuai dengan perubahan yang akan kita lakukan
dari Collections sebelumnya.

* "it" merepresentasikan masing masing item pada numberList.
 */