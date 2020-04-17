fun main() {
    val numbers = 1.rangeTo(10)

    val evenNumbers = numbers.filter(Int::isEvenNumber)
    val result = numbers.map(::mengalikan)
    val hasil = numbers.count(Int::menghitung)

    println(evenNumbers)
    println(result)
    println(hasil)

}

fun Int.isEvenNumber() = this % 2 == 0
fun mengalikan (value: Int) = value * 2
fun Int.menghitung() = this % 2 == 0

/*
* Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.

* Kita juga dapat mereferensikan extension functions dengan cara menyertakan
objek yang menjadi receivernya sebelum operator ":"
 */