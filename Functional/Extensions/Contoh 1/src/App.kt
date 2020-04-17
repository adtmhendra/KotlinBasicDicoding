// main function
fun main() {
    10.printInt() // 10 == int / receiver type.
}

fun Int.printInt() {
    print("value $this") // Output: value 10. int adalah receiver type.
}

/*
* Extension Functions
Pendeklarasian -> tentukan receiver type, kemudian nama fungsi().
dipisahkan oleh tanda titik "."
contoh : fun int.printInt() {}

* kata kunci "this" adalah receiver type yang bertindak sebagai objek
 */