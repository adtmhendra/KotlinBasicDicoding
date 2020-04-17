// main function
fun main() {
    println(10.slice)

    println("Kotlin".nama)

    println(20.jumlah) // Output 50
}

val Int.slice: Int
    get() = this / 2

val String.nama: Int
    get() = this.length

val Int.jumlah: Int
    get() = this + 30

/*
* Extension Properties
Pendeklarasian -> tentukan receiver type, kemudian nama properti.
dipisahkan oleh tanda titik "."
contoh : fun int.slice

* Pendeklarasian extension properties dalam mengembalikan
nilai sama halnya seperti extension functions.

* get() digunakan untuk mendapatkan nilai dari receiver type
kemudian diolah sesuai dengan kondisi yang diberikan.

* kata kunci "this" adalah receiver type yang bertindak sebagai objek
 */