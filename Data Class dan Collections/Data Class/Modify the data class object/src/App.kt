data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()

    // fungsi copy() juga dapat memodifikasi objek tsb dengan nilai yg baru
    val dataUser5 = dataUser3.copy(age = 16)
    println(dataUser2.copy(name = "Agus"))

    println(dataUser4)
    println(dataUser5)
}