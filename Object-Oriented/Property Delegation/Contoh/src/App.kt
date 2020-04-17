import kotlin.reflect.KProperty


class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

///////////////////////////////////////////////
class DelegateGenericClass {
    var value: Any = "Default"

    operator fun getValue (classRef: Any?, property: KProperty<*>) : Any {
        return value
    }

    operator fun setValue (classRef: Any?, property: KProperty<*>, newValue: Any) {
        value = newValue
    }

}

class Animal {
    var name: String by DelegateName()
    var weight: Any by DelegateGenericClass() //////////////
    var age: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Hero {
    var name: String by DelegateName()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    val animal = Animal()
    println(animal.name)
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    ///////////////////////////////////////////
    println("Kita mengubah ${animal.weight}")
    animal.weight = 20
    println("menjadi ${animal.weight}")
    ///////////////////////////////////////////

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}

/*
                        ** DELEGATE PROPERTY **
* Delegate Property digunakan untuk mengatur dan mengelola fungsi setter() dan getter()
untuk sebuah properti class

* Dengan Delegate Property akan meminimalisir terjadinya boilerplate dalam penulisan getter()
dan setter() pada setiap kelas yang kita buat.

* untuk mendelegasikan sebuah properti kelas, kita gunakan keyword by dalam menginisialisasi
properti tersebut kemudian diikuti dengan namanya.
 */