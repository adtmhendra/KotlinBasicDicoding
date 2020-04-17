// main function
fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

    val warna: Array<Color> = enumValues()
    for (i in warna) {
        print(i)
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}