package com.dicoding.oop

import com.dicoding.oop.utils.PI
import com.dicoding.oop.utils.factorial as faktorial
import com.dicoding.oop.utils.pow
import com.dicoding.oop.utils.sayHello

fun main() {
    sayHello()
    println(faktorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
}

/*
        ** MERUBAH NAMA SEBUAH FUNGSI, CLASS ATAU VARIABEL YANG TELAH DIIMPORT**

* Kita juga dapat mengganti nama sebuah kelas, fungsi atau variabel yang kita import dengan
menggunakan alias yang direpresentasikan dengan kata kunci "as"
contohnya pada fungsi factorial di atas.

* Biasanya "as" digunakan ketika kita menggunakan sebuah kelas, fungsi, maupun variabel yang
memiliki nama yang sama namun berbeda package-nya. Ini bertujuan untuk menghindari ambiguitas.
 */