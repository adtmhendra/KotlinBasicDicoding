// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1} // Output 1

    println(firstOddNumber)

    println(numberList.find { it < 3 }) // Output 1
    println(numberList.find { it > 3 }) // Output 4

    println(numberList.firstOrNull { it < 3 }) // Output 1
    println(numberList.firstOrNull { it > 3 }) // Output 4
    println(numberList.firstOrNull { it % 5 == 0 }) // Output 5. Dicari item yg pertama

    println(numberList.lastOrNull { it < 3 }) // Output 2
    println(numberList.lastOrNull { it > 3 }) // Output 10
    println(numberList.lastOrNull { it % 5 == 0 }) // Output 10. Dicari item yg terakhir
}