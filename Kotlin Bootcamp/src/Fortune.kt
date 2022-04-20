fun main (args: Array<String>) {
    for (i in 1..10) {
        val fortuneCookie = getFortuneCookie()
        println(fortuneCookie)
        if ("Take it easy and enjoy life".contentEquals(fortuneCookie)) {
            break;
        }
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
    "Things will go well for you today",
    "Enjoy a wonderful day of success",
    "Be humble and all will turn out well",
    "Today is a good day for exercising restraint",
    "Take it easy and enjoy life",
    "Treasure your friends because they are your greates fortune")
    print("Enter your birthday: ")
    val birthday: Int = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.div(fortunes.size)]
}