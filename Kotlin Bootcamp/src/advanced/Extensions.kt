package advanced

fun main () {
    staticExample()
    propertyExample()
    nullableExample()
}

//fun String.hasSpaces(): Boolean  {
//    val found: Char? = this.find { it == ' ' }
//    return found != null
//}

// shorter version of the hasSpaces() above
fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)
// extension function declared outside the class -> no access to private members
// extension function are evaluated statically
fun AquariumPlant.isRed() = color == "red"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(30)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() // AquariumPlant
}

// extending properties
val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    println(plant.isGreen)
}

fun AquariumPlant?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull()
}


