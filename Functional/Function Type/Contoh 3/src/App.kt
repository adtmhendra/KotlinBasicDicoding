// Contoh penggunaan nullable pada function type
typealias Arithmetic = ((Int, Int) -> Int)?

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum?.invoke(10, 10)
    val multiplyResult = multiply?.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}

/*
* Kita dapat menandai function type sebagai nullable dengan
menempatkannya di dalam tanda kurung dan diakhiri dengan safe call.
cth : typealias Arithmetic = ((Int, Int) -> Int)?
 */