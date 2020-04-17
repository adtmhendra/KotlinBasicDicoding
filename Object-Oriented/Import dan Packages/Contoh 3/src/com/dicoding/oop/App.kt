//package com.dicoding.oop
//import com.dicoding.oop.utils.* -> Mengimport seluruh fungsi, class & variabel yang ada pada package

// Mengimport seluruh fungsi, class & variabel yang ada pada package "kotlin.math"
import kotlin.math.*
import com.dicoding.oop.utils.areaOfCircle

fun main() {
//    sayHello()
//    println(factorial(4.0))       Baris kode yang di komen ini adalah fungsi, variabel, dan class
//    println(pow(3.0, 2.0))        yang ada pada package "com.dicoding.oop.utils"
//    println(areaOfCircle(13.0))

    println(cos(20.0))
    println(sqrt(20.5))
    println(PI)
    println(areaOfCircle(2.0))
}

/*
* Pada package "kotlin.math" terdapat banyak fungsi dan variabel yang dapat kita gunakan.
Kita bisa melihat pada completion suggestion setelah menuliskan "import kotlin.math "

* Kita dapat mengimpor seluruh kelas, fungsi dan variabel yang berada pada suatu package
dengan menggunakan tanda "*" pada akhir package tersebut.
 */