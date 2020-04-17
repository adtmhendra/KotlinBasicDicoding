// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    for ((index, _) in ranges.withIndex()) {
        println(index)
    }

    ranges.forEachIndexed { index, value ->
        println("Value $value is index $index")
    }

    ranges.forEachIndexed { index, _ -> print("$index ") }
}