class Animal {
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

/*
* Property Acessor
Jika properti dibuat secara MUTABLE (var), Kotlin akan menghasilkan fungsi GETTER() DAN SETTER().
Jika properti dibuat secara READ-ONLY (val), Kotlin hanya menghasilkan fungsi GETTER() pada properti tsb.

* Kita dapat membuat getter() dan setter() secara manual jika pada kasus tertentu kita perlu override fungsi yang ada.
 */