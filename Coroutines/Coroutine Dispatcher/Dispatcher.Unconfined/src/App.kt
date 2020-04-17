import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
                       ** DISPATCHER.UNCONFINED **
* Dispatcher yang menjalankan coroutines pada thread yang sedang berjalan
sampai mencapai titik penangguhan.

* Dispatcher ini menggunakan kumpulan thread yang dibuat berdasarkan permintaan.

* Output :
    Starting in main
    Resuming in kotlinx.coroutines.DefaultExecutor
Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi
delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali pada thread DefaultExecutor.
 */