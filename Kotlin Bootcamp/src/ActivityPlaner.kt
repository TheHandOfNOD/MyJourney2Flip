fun main(args: Array<String>) {
    println(whatShouldIDoToday(readLine()!!))
    println(whatShouldIDoToday(readLine()!!, "rainy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHikingDay(mood, weather) -> "go hiking"
        isWorkoutDay(mood, weather) -> "workout"
        isBedDay(mood, weather, temperature) -> "stay in bed"
        isTimeToSwim(temperature) -> "go swimming"
        else -> "stay home"
    }
}

fun isHikingDay(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isWorkoutDay(mood: String, weather: String) = mood == "happy" && weather == "rainy"
fun isBedDay(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 10
fun isTimeToSwim(temperature: Int) = temperature > 35