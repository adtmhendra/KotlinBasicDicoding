data class DataUser(val name : String, val age : Int) {
    // Kita juga dapat membuat fungsi di dalam data class
    fun intro() {
        println("My name is $name i am $age years old")
    }
}

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("Hendra", 18)
    dataUser2.copy(age = 24).intro() // Menampilkan output sesuai fungsi intro()

    // Membuat beberapa variabel dari objek dataUser secara langsung
    val (name, age) = dataUser
    val (nama, usia) = dataUser2.copy(age = 20)

    println("My name is $name, I am $age years old")
    println("My name is $nama, I am $usia years old")

}

/*
Bisa disimpulkan bahwa data class dapat
memetakan objek menjadi sebuah varibel dengan 2 cara,
yaitu dengan Destructuring Declarations menggunakan .componentN()
dan membuat variabel dari objek secara langsung seperti contoh di atas.

Kita juga dapat menerapkan sebuah behaviour di dalam data class.
contohnya yaitu membuat fungsi dan langsung mengaksesnya dari
fungsi main().
 */