fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("happy", "rainy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go hiking"
        mood == "happy" && weather == "rainy" -> "workout"
        else -> "stay home"
    }
}