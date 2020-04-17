import kotlin.NumberFormatException

// main function
fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt() // Kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil!")
            -1 -> println("Catch block NumberFormatException terpanggil!")
            else -> println(someIntValue)
        }
    }

    // LATIHAN
    val angka: String? = "20"
    val someAngka: Int

    try {
        someAngka = angka!!.toInt()
        println(someAngka)
    } catch (e: NullPointerException) {
        println("Nama tidak boleh kosong. Harap masukkan data dengan benar!")
    } catch (e: NumberFormatException) {
        println("Nama harus berupa bilangan bulat!")
    }

}

/*
                 ** Exception Handling dengan "multiple-catch" **
* Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih
dari satu tipe exception.

            try{
                // Block try, menyimpan kode yang membangkitkan exception
            } catch (e: NullPointerException) {
                // Block catch akan terpanggil ketika terjadi NullPointerException.
            } catch (e: NumberFormatException) {
                // Block catch akan terpanggil ketika terjadi NumberFormatException.
            } catch (e: Exception) {
                // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
            }
            finally {
                // Block finally akan terpanggil setelah keluar dari block try atau catch
            }

Penjelasan :
* Block catch pertama menggunakan parameter NullPointerException, sehingga jika terjadi
NullPointerException maka blok catch tersebut akan dieksekusi.
* Block catch kedua menggunakan parameter NumberFormatException, sehingga jika terjadi
NumberFormatException maka blok tersebut yang akan dieksekusi.
* Block catch ketiga menggunakan parameter Exception, blok ini akan menangani seluruh exception
yang terjadi kecuali untuk dua exception yang telah ditentukan pada blok sebelumnya.
 */