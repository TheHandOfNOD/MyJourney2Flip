fun main () {
    var fortuneCookie = ""
    while(!fortuneCookie.contains("Take it easy")) {
        fortuneCookie = getFortuneCookie(getBirthday())
        println(fortuneCookie)
    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
    "Things will go well for you today",
    "Enjoy a wonderful day of success",
    "Be humble and all will turn out well",
    "Today is a good day for exercising restraint",
    "Take it easy and enjoy life",
    "Treasure your friends because they are your greates fortune")
    return when (birthday) {
        28 -> fortunes[0]
        in 1..7 -> fortunes[3]
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}