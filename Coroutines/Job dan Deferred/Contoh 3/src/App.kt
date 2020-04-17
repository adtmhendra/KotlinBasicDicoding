import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task") // Output : Other task, Start new job!
}

/*
                    ** MENJALANKAN JOB MENGGUNAKAN FUNGSI JOIN() **
* Cara inisialisasi :
  Pilih objek yang ingin di jalankan, pisahkan dengan titik sebelum
  memanggil fungsi join().
    contoh : job.join()
 */