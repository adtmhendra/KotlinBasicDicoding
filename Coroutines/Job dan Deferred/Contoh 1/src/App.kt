import kotlinx.coroutines.*

fun main() = runBlocking {

    // menggunakan launch()
    val jobLaunch = launch (start = CoroutineStart.LAZY) {
        // do background task here }
    }

    // menggunakan job()
    val job = Job()
}

/*
              ** CARA MENGINISIALISASI FUNGSI JOB DAN LAUNCH **
* Job dapat dijalankan menggunakan fungsi job() dan launch().
* Jika ingin membuat sebuah job tanpa langsung menjalankannya, kita
bisa menggunakan (start = CoroutineStart.LAZY).
* Dengan menggunakan (start = CoroutineStart.LAZY) maka job akan dijalankan nanti
setelah dibutuhkan.
 */