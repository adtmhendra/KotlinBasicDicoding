data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    // Menyalin dataUser dengan fungsi copy()
    val dataUser4 = dataUser.copy()
    // fungsi copy() juga dapat memodifikasi objek tsb dengan nilai yg baru
    val dataUser5 = dataUser2.copy(name = "Hendra", age = 20)
    val dataUser6 = dataUser3.copy(name = "Yudha")

    println(dataUser4)
    println(dataUser5)
    println(dataUser6)
}