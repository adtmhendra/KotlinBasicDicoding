// main function
fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slice)    // Output : 0
    println(value1.slice)   // Output : 5

    val angka: Int? = null
    val angka2: Int? = null

    println(angka?.bagi)    // Output : null
    println(angka2?.bagi)   // Output : 5
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0   // Nullable receiver type

val Int.bagi: Int
    get() = this.div(2)

/*
* Mendeklarasikan sebuah extension dengan nullable receiver type
 */