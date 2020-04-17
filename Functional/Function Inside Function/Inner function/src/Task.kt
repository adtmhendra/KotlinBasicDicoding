fun main() {
    val result = sum(10, 30, 40)
    println(result)
    setWord("Hendra")
    val a = hitung(0, 20, 30)
    println(a)
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB
}

// inner function
fun setWord (message: String) {
    fun printMessage() {
        println(message)
    }
    printMessage()
}

fun hitung (nilaiA: Int, nilaiB: Int, nilaiC: Int): Int {
    fun validasi (value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    validasi(nilaiA)
    validasi(nilaiB)
    validasi(nilaiC)

    return nilaiA + nilaiB
}

/*
* Fungsi di dalam fungsi.
* inner function hanya bisa diakses setelah fungsi tersebut didefinisikan.
* inner function biasanya digunakan untuk menghindari boilerplate.
*/