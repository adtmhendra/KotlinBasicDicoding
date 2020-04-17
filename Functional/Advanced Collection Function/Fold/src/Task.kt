fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("Fold result: $fold") // Output: 16
/*
* Fungsi foldRight() akan melakukan proses iterasi dari indeks listOf terakhir.
* Posisi argumen dalam lambda expressionnya kebalikan dari fungsi fold().
 */

    example()
}

fun example() {
    val items = listOf(1, 2, 3) // item
    val fold = items.fold(10) { current, item -> // nilai awal = 10
        println("Current is $current")
        println("item is $item")
        current - item
    }
    println("Final result is $fold") // Output: 4
}

/*
* Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk
perhitungan dan lambda expression yang nilai kembaliannya digunakan
untuk menentukan nilai awal selanjutnya.

* Di dalam lambda expression terdapat 2 argumen yaitu argumen current
yang merepresentasikan nilai awal dan argumen item yang merepresentasikan
masing-masing item pada "items".
 */