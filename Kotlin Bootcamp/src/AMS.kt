import kotlin.random.Random

fun main() {
    feedTheFish()
    swim(50) // no argument so the default value will be used
    swim(10, speed = "slow") // overwrite the default value

    println(if (!canAddMoreFish(10.0, listOf(3,3,3))) "korrekt" else "falsch")
    println(if (canAddMoreFish(8.0, listOf(2,2,2), hasDecorations = false)) "korrekt" else "falsch")
    println(if (!canAddMoreFish(9.0, listOf(1,1,3), 3)) "korrekt" else "falsch")
    println(if (canAddMoreFish(10.0, listOf(),7, true)) "korrekt" else "falsch")
}

fun swim(@Suppress("UNUSED_PARAMETER") time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(
    day: String, //it's good practice to place arguments without default value at first
    temperature: Int = 22,
    dirty: Int = getDirtySensorRead()) : Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorRead() = 20


// single line function. The return type can be inferred by the compiler
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

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
        dirtyProcessor()
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

var dirty = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
fun feedFish (dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    // last parameter called syntax -> outside the braces but still used as the parameter value
    dirty = updateDirty(dirty) { dirty -> // looks like overwriting to me
        println("so this is executed and not just beeing a redefined body for the function")
        dirty + 50
    }
    // it's even possible to define it in the parentheses
    dirty = updateDirty(dirty,{ dirty ->
        println("now it's more clear to me that this is a parameter")
        dirty + 50
    })
}

