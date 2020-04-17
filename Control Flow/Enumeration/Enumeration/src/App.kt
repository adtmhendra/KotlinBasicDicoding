// main function
fun main() {
    val color : Color = Color.RED
    println(color)

    // Berbagai cara dalam mengambil objek dalam class enum
    val a: Array<Kendaraan> = Kendaraan.values()
    a.forEach { a -> println(a) }
    /* for (i in a) {
         println(i) */

    val b: Kendaraan = Kendaraan.valueOf("Sepeda")
    println(b)

    val c: Kendaraan = enumValueOf("Motor")
    println(c)

    val d: Array<Kendaraan> = enumValues()
    d.forEach { d -> println("$d ${d.ordinal}") }

    val kendaraan = enumValueOf<Kendaraan>("Mobil")
    println("Posisi $kendaraan adalah ${kendaraan.ordinal}")

}

enum class Color{
    RED, GREEN, BLUE
}

enum class Kendaraan {
    Mobil,
    Motor,
    Sepeda,
    Becak
}