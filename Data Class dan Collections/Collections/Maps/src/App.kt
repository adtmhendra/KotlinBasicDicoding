fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapValues = capital.values

    println(capital.keys)
    println(mapValues)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println("Mutable Map : $mutableCapital")
}

/*
* String yang berada di sebelah kiri "to"
merupakan key. dan String yang berada di
sebelah kanan "to" adalah value nya.

* Fungsi keys() digunakan untuk mengambil key apa saja
yang berada di dalam map capital. Fungsi ini mengembalikan
nilai berupa Set karena key pada map haruslah unik.

* Fungsi values() digunakan untuk mengambil nilai apa saja
yang berada di dalam map capital. Fungsi ini mengembalikan
nilai berupa Collections sebagai tipe datanya.

*
 */