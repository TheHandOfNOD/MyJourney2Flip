package spicetesting

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("indian", "mild")),
                            SpiceContainer(Curry("american", "mild")),
                            SpiceContainer(Curry("spanish", "hot")))
    for (spiceContainer in spiceCabinet) {
        println(spiceContainer.label)
    }
}

data class SpiceContainer (val spice: Spice) {
    val label
        get() = spice.name
}