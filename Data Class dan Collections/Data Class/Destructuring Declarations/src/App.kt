data class DataUser (val name : String, val age : Int)
data class Kendaraan (val namaKendaraan: String, val harga: Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val kendaraan = Kendaraan("Mobil", 100000000)

    /*
     Dalam objek dataUser di atas, component1() adalah name yaitu "nrohmen"
     sedangkan component2() adalah age yaitu 17
     */
    val name = dataUser.component1() // Disimpan ke dalam variabel baru yaitu "name"
    val age = dataUser.component2() // Disimpan ke dalam variabel baru yaitu "age"

    val namaKendaraan = kendaraan.component1()
    val harga = kendaraan.component2()

    println("My name is $name, I am $age years old")
    println("Saya berangkat kerja menggunakan $namaKendaraan" +
            " dengan harga $harga")
}

/*
 NOTE !!!!
 Destructuring Declaration adalah proses memetakan objek
 menjadi sebuah variabel dengan menggunakan fungsi .componentN()
 kemudian menyimpannya ke dalam sebuah variabel baru.
 */