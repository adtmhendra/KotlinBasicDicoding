// main function
fun main() {
    val message = buildString {
        append("Hello ") // Action(argumenLambda)
        append("from ")
        append("lambda ")
    }
    println(message)

    println(example {
        append(20)
        append(30)
        append(40)
    })

}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder() // stringBuilder adalah variabel yang bertipe StringBuilder
    stringBuilder.action() // Memanggil parameter action dengan variabel yang bertipe StringBuilder
    return stringBuilder.toString() // Mengembalikan nilai action dalam bentuk String
}

fun example (action: StringBuilder.() -> Unit) : StringBuilder {
    val example2 = StringBuilder()
    example2.action()
    return example2
}

/*
* StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
* Kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder.
* Parameter action di atas dipanggil ketika kita melampirkan argumen lambda saat fungsi tersebut digunakan.
*/