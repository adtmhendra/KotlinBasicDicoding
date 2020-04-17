// main function
fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]

    /*
       Kita harus mendeklarasikan tipe data secara eksplisit apabila
       kita ingin membuat variabel list tanpa langsung menambahkan datanya.
    */
    val contributor = listOf<String>()
    // Mendeklarasi lebih dari 1 tipe parameter untuk sebuah class.
    val points = mapOf<String, Int>("alfian" to 20, "hendra" to 30)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}