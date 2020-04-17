import kotlinx.coroutines.*

@ObsoleteCoroutinesApi
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
                         ** DISPATCHER.Thread Pool **
* Dispatcher yang memiliki kumpulan thread.
* Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia
pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan
juga menentukan bagaimana proses distribusi bebannya.

* Penerapannya menggunakan fungsi newFixedThreadPoolContext().

* Dalam contoh di atas, kita telah menetapkan thread myPool sebanyak 3 thread.
Runtime akan secara otomatis menentukan pada thread mana coroutine akan dijalankan
dan dilanjutkan.

* Output :
    Starting in myPool-1
    Resuming in myPool-2
*/