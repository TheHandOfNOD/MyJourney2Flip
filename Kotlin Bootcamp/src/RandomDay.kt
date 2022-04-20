import kotlin.random.Random

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val random = Random(1)
    for (i in 0..100) {
        val day = randomDay(random)
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }
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

