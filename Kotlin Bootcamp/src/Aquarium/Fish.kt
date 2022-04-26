package Aquarium

/*
volumeNeeded has neither "val" nor "var" so Kotlin does not create a property
 */
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init { // init blocks always run before secondary constructors
        println("first init block")
    }

    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded. Final size ${this.size}")
    }

    init {
        println("last init block")
    }
}
// In Kotlin it's better to make a helper method instead of using a secondary constructor
fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is this fish friendly? ${fish.friendly}. It needs volume: ${fish.size}")
}