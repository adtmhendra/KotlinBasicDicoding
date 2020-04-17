// main function
fun main() {
    println(10.plusThree()) // 10 + 3 = 13

    0.abjad() // Output: 0, 1, 2, 3, 4, 5
}

fun Int.plusThree(): Int {
    return this + 3 // this == receiver type Int bernilai 10.
}

fun Int.abjad(): Int {
    var a = this // this == receiver type Int bernilai 0.
    while (a <= 5) {
        print("$a ")
        a++
    }
    return a
}

/*
* Pendeklarasian extension functions dalam mengembalikan
nilai sama halnya seperti fungsi pada umumnya.

* kata kunci "this" adalah receiver type yang bertindak sebagai objek
 */