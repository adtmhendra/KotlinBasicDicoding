import com.sun.xml.internal.fastinfoset.util.StringArray

// main function
fun main() {
    val number = sumNumbers(10, 20, 30, 40, 50)
    println(number)

    val hasil = nama('E', 'B', 'D', 'C', 'A')
    println(hasil)

    println(asList(20, 30, 40, ""))
    println(asStringList("Hendra", "Yudha", "Dimas"))
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun nama(vararg name: Char): CharArray {
    return name.sortedArray()
}

fun <T> asList(vararg input: T): ArrayList<T> {
    val result = ArrayList<T>()
    for (item in input) {
        result.add(item)
    }
    return result
}

fun <item> asStringList(vararg input: item): ArrayList<item> {
    val result = ArrayList<item>()
    for (i in input) {
        result.add(i)
    }
    return result // Mengembalikan nilai dalam bentuk ArrayList()
}

/*
* Vararg argument digunakan untuk menyederhanakan parameter
yang memiliki tipe data yang sama.

* Dengan vararg, sebuah fungsi dapat memiliki jumlah parameter
berdasarkan jumlah argument yang kita masukkan ketika fungsi
itu dipanggil.
 */