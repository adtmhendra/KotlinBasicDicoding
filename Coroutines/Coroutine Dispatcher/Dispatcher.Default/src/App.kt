import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        // TODO: Implement suspending lambda here
    }

    // Penulisan Dispatchers.Default secara eksplisit
    launch(Dispatchers.Default) {
        // TODO: Implement suspending lambda here
    }

    println("Dispatcher Default")
}

/*
                                ** DEFERRED **
* Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines. Nilai
ini nantinya bisa dikelola sesuai dengan kebutuhan.

* Deferred akan menghasilkan nilai ketika proses komputasi sukses dan gagal.

* Hasil dari deferred tersedia ketika mencapai state completed dan diakses
menggunakan fungsi await().

* Deferred akan mengirimkan pengecualian jika ia telah gagal. Kita bisa mengakses
nilai pengecualian tersebut dengan fungsi getCompletionExceptionOrNull().

* Deferred bisa diaktifkan saat fungsi start(), join(), atau await() dipanggil.
 */