fun main() {
    println("Factorial 10 is: ${factorial(10)}") // Output: 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 3628800
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

/*
* Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri
sehingga memungkinkan sebuah fungsi dapat berjalan beberapa kali.
 */