import java.time.DayOfWeek
import java.time.LocalDate.now
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter.ofPattern

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    dayOfWeek()

    // Just some test lines
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println("Is it hot? " + if (isHot) "yes" else "no")

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)
}

fun dayOfWeek() {
    print("What day is today? ")
    print(ofPattern("dd.MM.yyyy").format(now(ZoneId.systemDefault())))
    when(LocalDateTime.now().dayOfWeek) {
        DayOfWeek.MONDAY -> println(": Hey it's a " + DayOfWeek.MONDAY.name)
        DayOfWeek.TUESDAY -> println(": Hey it's a " + DayOfWeek.TUESDAY.name)
    }
}