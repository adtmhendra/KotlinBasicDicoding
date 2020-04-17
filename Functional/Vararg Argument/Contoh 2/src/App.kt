// main function
fun main() {
    println(sets(10, 10, name = "Kotlin")) // Named argument
}

fun sets(vararg number: Int, name: String): Int {
    println(name)
    return number.sum()
}

fun <item> asIntList(vararg angka: item): ArrayList<item>{
    val result = ArrayList<item>()
    for (item in angka) {
        result.add(item)
    }
    return result
}

/*
     Aturan - aturan dalam penulisan vararg :
* Dalam satu fungsi TIDAK BOLEH memiliki 2 vararg.
* Jika ingin menambahkan parameter baru (bertipe data beda)
  tanpa kata kunci vararg, maka parameter yang ditandai
  dengan vararg HARUS berada pada posisi pertama.
* Untuk memberikan argumen untuk parameter baru, kita harus
  memanfaatkan named argument untuk menandai.
 */