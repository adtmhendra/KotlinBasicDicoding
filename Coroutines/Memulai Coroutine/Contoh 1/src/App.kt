import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}

/*
                        ** KOTLIN COROUTINES **
* Fungsi runBlocking -> memulai couroutine utama
* Fungsi launch -> menjalankan couroutine baru
* Fungsi delay(1000L) -> menunda kode berikutnya selama 1 detik
Selama proses penundaan tersebut, main thread akan terus berjalan
sehingga fungsi println("Hello,") akan langsung dijalankan.
Setelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan.
* Fungsi delay(2000L) -> menunda selama 2 detik sebelum JVM berakhir
 */