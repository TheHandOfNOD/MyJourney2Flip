import kotlin.random.Random

fun main(args: Array<String>) {
    feedTheFish()
    swim(50) // no argument so the default value will be used
    swim(10, speed = "slow") // overwrite the default value

    println("${ if (!canAddMoreFish(10.0, listOf(3,3,3))) "korrekt" else "falsch"}")
    println("${ if (canAddMoreFish(8.0, listOf(2,2,2), hasDecorations = false)) "korrekt" else "falsch"}")
    println("${ if (!canAddMoreFish(9.0, listOf(1,1,3), 3)) "korrekt" else "falsch"}")
    println("${ if (canAddMoreFish(10.0, listOf(),7, true)) "korrekt" else "falsch"}")
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(
    day: String, //it's good practice to place arguments without default value at first
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {
    return true
}

fun feedTheFish() {
    val random = Random(1)
    for (i in 0..10) {
        val day = randomDay(random)
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
//        shouldChangeWater(day) // only mandatory (no default) argument is specified
//        shouldChangeWater(day, 24) // first default value can be specified without declaring the name
//        shouldChangeWater(day, dirty = 60) // second argument has to be specified by name
//        shouldChangeWater(day, 19, 67) // no names if all arguments are specified
        if (shouldChangeWater(day))
            println("change the water today")
    }
}

fun canAddMoreFish(tankSize: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true): Boolean {
    val totalSize = currentFish.sum() + fishSize

    if (hasDecorations && (tankSize.times(0.8) >= totalSize)) {
        return true
    } else if (!hasDecorations && tankSize >= totalSize) {
        return true
    } else
        return false
}

fun randomDay(random: Random): String {
    val week = listOf<String>("Mo", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    return week[random.nextInt(0,7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Mo" -> "flakes"
        //"Tue" -> "pellets" -> removed for reaching the else branch
        "Wed" -> "redworms"
        "Thu" -> "granules"
        "Fri" -> "mosquitos"
        //"Sat" -> "lettuces" -> removed for reaching the else branch
        "Sun" -> "plankton"
        else -> "fasting"
    }
}

