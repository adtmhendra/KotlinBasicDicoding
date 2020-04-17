fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { println("$it ") } // Output 1, 2, 3, 4, 5
    println("")
    val exampleSequenceNumber = generateSequence(3) {it + 5}
    exampleSequenceNumber.take(5).forEach { println(it) }
    // .take(10) -> batas maksimal looping 5 kali
}

/*
* Fungsi generateSequence() memiliki 2 parameter.
- Parameter pertama : item pertama yang ada di dalam collection
yang akan di print.
- Parameter kedua : Lambda expression. yang berisi perubahan
 data pada masing-masing item.

* Fungsi generateSequence() membutuhkan fungsi take(Int) sebagai batas
agar tidak terjadi infinite loop.
 */