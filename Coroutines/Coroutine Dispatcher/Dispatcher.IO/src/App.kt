import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    // Menambahkan Dispatcher.IO pada coroutines builder
    launch(Dispatchers.IO) {
        // TODO: Implement algorithm here
    }

    println("Dispatcher IO")
}

/*
                          ** DISPATCHER.IO **
* Dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O.
* Dispatcher ini menggunakan kumpulan thread yang dibuat berdasarkan permintaan.
*/