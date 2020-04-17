// main function
fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    println(sets(10, 20, 20, *number , 10))

    println(set(arrayOf(10, 20, 30)))

    println(intList(10, 20, 30))
}

fun sets(vararg number: Int): Int {
    return number.sum()
}

fun set(number: Array<Int>): Int {
    return number.sum()
}

fun intList(vararg input: Int): ArrayList<Int> {
    val result = ArrayList<Int>()
    for (item in input) {
        result.add(item)
    }
    return result
}

/*
                Perbedaan Vararg vs Array<T>
* Ketika fungsi yang menggunakan Array<T> sebagai parameter
dipanggil, fungsi tsb membutuhkan argumen berupa nilai yang
SUDAH berbentuk Array dan tidak dapat memasukkan nilai lagi.

* Dalam vararg, kita bisa memasukkan argumen satu per satu.
kita juga dapat memasukkan nilai yang sudah berbentuk Array
sebagai argumen untuk parameter yang ditandai dengan spread
operator (*)
 */