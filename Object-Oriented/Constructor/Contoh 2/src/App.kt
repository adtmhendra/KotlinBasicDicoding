class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    // Init berfungsi memvalidasi nilai Properti
    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

/*
                Fungsi init pada Primary Constructor
* Menginisialisasi properti class.
* Membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
contoh : Melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
* Primary constructor dan init harus saling terhubung.
* Fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan primary constructor.
 */