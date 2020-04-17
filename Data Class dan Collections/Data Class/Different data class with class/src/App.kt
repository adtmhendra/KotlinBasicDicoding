// Mengetahui perbedaan antara class dan data class
class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("hendra", 20)

    println(user)
    println(dataUser)
}