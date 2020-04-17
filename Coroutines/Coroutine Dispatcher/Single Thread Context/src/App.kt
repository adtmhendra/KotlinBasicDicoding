import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
                    ** DISPATCHER.Single Thread Context **
* Dispatcher yang menjamin bahwa setiap saat coroutine akan dijalankan pada thread
yang Anda tentukan.

* Penerapannya menggunakan newSingleThreadContext().

* Output :
    Starting in myThread
    Resuming in myThread
Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread.
*/