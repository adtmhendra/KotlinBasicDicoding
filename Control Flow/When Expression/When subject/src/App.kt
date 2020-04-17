import kotlin.random.Random

// main function
fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    when(val a = random()) {
        in 1..20 -> println(20 * a)
        in 20..50 -> println(50 * a)
        else -> print("Tidak ada")
    }
}

fun getRegisterNumber() = Random.nextInt(50)

// Memberi fungsi bernilai random dari 1 sampai 100
fun random() = Random.nextInt(100)