import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000) // Job membutuhkan waktu 5 detik untuk dijalankan.
        println("Start new job!")
    }

    delay(2000) // Ketika mencapai 2 detik, job dibatalkan.

    // Kita bisa menambah parameter terhadap fungsi cancel().
    job.cancel(cause = CancellationException("Time is up!")) // Job memasuki state cancelling.
    println("Cancelling job...")
    if (job.isCancelled){ // Saat pembatalan berhasil, job memiliki state cancelled.
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}

/*
                        ** MELAKUKAN PEMBATALAN JOB **
* Jika cancel() dipanggil ketika job belum dijalankan, maka job tersebut tidak
tidak melalui state Cancelling, tetapi langsung memasuki state Cancelled.

* Kita bisa menambahkan parameter terhadap fungsi cancel() yaitu parameter cause
yang bisa digunakan untuk memberitahu kenapa sebuah job dibatalkan.

* Fungsi getCancellationException() berisi nilai "Time is up!"
 */