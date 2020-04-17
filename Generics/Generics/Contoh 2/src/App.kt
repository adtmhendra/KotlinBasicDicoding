// main function
fun main() {
    val numbers = listOf(20, 40, 60, 80)
    print(numbers.slice(1..10))
}

/*
public fun <T> List<T>.slice(indices: IntRange): List<T> {
    if (indices.isEmpty()) return listOf()
    return this.subList(indices.start, indices.endInclusive + 1).toList()
}
*/

/*
*  Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi
yang berhubungan dengan List.
*
 */