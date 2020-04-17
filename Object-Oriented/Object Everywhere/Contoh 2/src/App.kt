// main function
fun main() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}

/*
* Kita dapat mengubah tipe data dengan fungsi yang tersedia dari sebuah objek String
 */