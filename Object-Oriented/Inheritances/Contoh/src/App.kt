// Open class wajib digunakan sebelum melakukan extends kelas Animal
open class Animal(var name: String,
                  val weight: Double,
                  val age: Int,
                  val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }

//    open fun isTrue() {
//        when (isCarnivore) {
//            true -> println("He is Carnivore")
//            false -> println("He is not Carnivore")
//            else -> println("")
//        }
//    }
}

// LATIHAN CLASS CAT
// Class Cat adalah child class, melakukan extends pada kelas Animal
class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia!")
    }

    override fun eat(){
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}

// LATIHAN CLASS SNAKE
// Class Snake adalah child class, melakukan extends pada kelas Animal
class Snake (pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val skinColor: String, val isToxic: Boolean)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {
    fun isBite() {
        println("$name is biting his owner")
    }

    override fun eat() {
        println("$name is eating his food")
    }

    override fun sleep() {
        println("$name is sleeping now")
    }
}

// LATIHAN CLASS FISH
// Class Fish adalah child class, melakukan extends pada kelas Animal
class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val scaleColor: String, val numberOfFin: Int)
    : Animal (pName, pWeight, pAge, pIsCarnivore) {
    fun swim() {
        println("$name is swimming")
    }

    override fun eat() {
        println("$name is eating pelet")
    }

    override fun sleep() {
        println("$name is sleeping")
    }

    fun isTrue() {
        when (isCarnivore) {
            true -> println("He is Carnivore")
            false -> println("He is not Carnivore")
            else -> println("")
        }
    }
}


fun main(){
    // Class Cat
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
    println("My cat's weight is ${dicodingCat.weight} kg")
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

    // Class Snake
    val dicodingSnake = Snake("Garaga", 20.2, 20, true, "Brown", true)
    dicodingSnake.name = "GIRIGI" // Mengubah nama Snake
    println("""
        Name of Snake is ${dicodingSnake.name}
        he has ${dicodingSnake.skinColor} skin
        he is turning ${dicodingSnake.age} yo
    """.trimIndent())
    dicodingSnake.isBite()
    dicodingSnake.eat()
    dicodingSnake.sleep()

    // Class Fish
    val dicodingFish = Fish("Bubi", 2.0, 3, false, "Brown and Grey", 3)


    println("Name of my Fish is ${dicodingFish.name}")
    dicodingFish.eat()
    dicodingFish.swim()
    println("""
        He has ${dicodingFish.scaleColor} skin
        He has ${dicodingFish.numberOfFin} fins
    """.trimIndent())
    dicodingFish.isTrue()


}

/*
* Banyak Objek yang berbeda tetapi memiliki banyak kesamaan
Contohnya kucing dan kambing yang memiliki banyak kesamaan karena objek tersebut adalah hewan.
yang membedakan hanyalah bagaimana cara mereka tidur, makan, dll.

* Dalam kasus di atas, kelas Animal berfungsi sebagai parent class, dan class lainnya dapat melaukan
extends terhadap parent class Animal tersebut.

* Class lain yang melakukan parent terhadap parent class disebut child class.
Isi class child ini adalah hal hal spesifik yang hanya dilakukan oleh class tersebut.

* Dalam membuat parent class kita wajib menggunakan "open class" sebelum melakukan extends pada class tersebut.

* Inheritances atau pewarisan dilakukan agar mencegah kita dalam melakukan perulangan kode.
 */