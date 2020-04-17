interface IFly {
    fun fly()
    val numberOfWings: Int
}

interface ISwim {
    val howMuchMeter: Int
    fun swim()
}

class Fish (override val howMuchMeter: Int) : ISwim {
    override fun swim() {
        if (howMuchMeter > 0) println("I swim for $howMuchMeter")
        else println("I can't swim")
    }
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}


fun main() {
    val bird = Bird(2)
    bird.fly()

    val fish = Fish(0)
    fish.swim()

}

/*
                            ** INTERFACES **
* Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas.
* Kelas yang mengimplementasikan sebuah interface WAJIB melakukan override
seluruh properti dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat
pada interfaces-nya.

* Penamaan sebuah interface dituliskan dengan awalan huruf I kapital.
 */