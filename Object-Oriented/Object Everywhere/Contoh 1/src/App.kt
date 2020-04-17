// main function
fun main() {
    val company = "Dicoding"
    println(company.reversed())
    println(company.toUpperCase())
    println(company.toLowerCase())





    // * Bedah Kode * //
    val namaLengkap = "Hendra" // Kita telah membuat VARIABEL yang JUGA MERUPAKAN sebuah OBJEK dengan nama "namaLengkap".
    /*
    Objek (namaLengkap) merupakan HASIL REALISASI dari CLASS "STRING" sehingga, objek (namaLengkap)
    dapat mengakses fungsi dan properti yang merupakan anggota dari CLASS STRING.
     */

    println(namaLengkap.reversed())
    /*
     Dari completion suggestion yang ada di Intellij Idea, kita bisa melihat beberapa fungsi yang dapat digunakan oleh OBJEK
     namaLengkap
    */

}

/*
                                       NOTEEE!!!!!!!!
    OBJEK merupakan REALISASI dari sebuah BLUEPRINT yang tentunya memiliki properti dan fungsi
    yang sama dengan blueprint-nya. Salah satu kegunaan OBJEK adalah untuk MENGAKSES berbagai
    PROPERTI dan FUNGSI pada CLASS.

* Dalam Kotlin, nilai primitif seperti String, Int, Boolean, dan Int merupakan sebuah OBJEK.

* class == blueprint(kerangka)
    OBJEK merupakan HASIL REALISASI dari blueprint(kerangka) atau yang biasa disebut dengan CLASS.
    Oleh karena itu, dengan membuat OBJEK maka kita DAPAT MENGAKSES fungsi dan properti yang terdapat
    pada CLASS tersebut.
 */