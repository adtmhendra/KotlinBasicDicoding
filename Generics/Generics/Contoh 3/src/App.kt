// main function
fun main() {
    val angka = listOf(1, 2, 3, 4)
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    //  val numbers3 = ListNumber<String>() error : Type argument is not within its bounds
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
interface List<T> {
    operator fun get(index: Int): T
}