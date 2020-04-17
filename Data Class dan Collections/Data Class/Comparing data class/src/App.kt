data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser))
    println(dataUser.equals(dataUser2))
    println(dataUser2.equals(dataUser3)) // Output ini bernilai false karena
    // dataUser2 dan dataUser3 memiliki value yang berbeda

}