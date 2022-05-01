package spicetesting

fun main(args: Array<String>) {
    val spices = listOf(
        Curry("indian", "mild"),
        Curry("american", "medium"),
        Curry("spanish", "spicy"),
    )

    val mildSpices = spices.filter {spice -> spice.heat <= 3 }
    println(mildSpices)

}