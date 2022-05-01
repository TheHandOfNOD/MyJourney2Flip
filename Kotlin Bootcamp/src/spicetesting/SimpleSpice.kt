package spicetesting

fun main() {
    println(SimpleSpice("curry", "none", GoldSpiceColor))
}

class SimpleSpice(name: String, spiciness: String, color: SpiceColor): Spice(name, spiciness, color) {

    override fun prepareSpice() {
        TODO("Not yet implemented")
    }
}