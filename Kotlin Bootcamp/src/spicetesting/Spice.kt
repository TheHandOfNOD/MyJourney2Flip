package spicetesting

fun main(args: Array<String>) {

}
abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 9
                else -> 0
            }
        }

    init {
        println("Spice[name: $name, spiciness: $spiciness, heat: $heat")
    }

    abstract fun prepareSpice()
}

class Curry (name: String, spiciness: String, color: SpiceColor = GoldSpiceColor) : Spice(name, spiciness, color), Grinder {


    override fun prepareSpice() {
        grind()
    }
    override fun grind() {
        println("grind by Curry")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object GoldSpiceColor : SpiceColor {
    override var color = "gold"
}