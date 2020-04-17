// main function
fun main() {
    val fullName = getFullName(first = "kotlin", middle = "is", last = "awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}