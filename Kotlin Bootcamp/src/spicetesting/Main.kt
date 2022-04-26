package spicetesting

fun main(args: Array<String>) {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
    )

    val mildSpices = spices.filter {spice -> spice.heat <= 3 }
    println(mildSpices)

}