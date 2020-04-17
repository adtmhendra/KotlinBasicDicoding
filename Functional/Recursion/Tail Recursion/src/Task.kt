fun main() {
    println("Factorial 10 is: ${factorial(10)}")
}

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}

/*
* Tail recursion yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine)
yang dijalankan terakhir pada sebuah prosedur.

* Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan.

* Ketika sebuah fungsi ditandai dengan modifier tailrec, maka fungsi tersebut hanya boleh dipanggil
untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.
 */