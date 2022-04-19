import java.time.LocalTime
import java.time.format.DateTimeParseException

fun main (args: Array<String>) {
    //simpleTry(args)
    stringTemplateTry(args)
}

fun simpleTry(args: Array<String>) {
    if (args.size != 1) {
        throw IllegalArgumentException("The call is only allowed if 1 mandatory argument is provided")
    }
    try {
        val time = LocalTime.parse(args[0])
        if (time.hour < 12)
            println("Good morning, Kotlin")
        else
            println("Good night, Kotlin")
    } catch(ex: DateTimeParseException) {
        throw IllegalArgumentException("The program argument has to be in a valid time format: [hh]:[mm]")
    }
}

/**
 * Has no Argument-Check I guess
 */
fun stringTemplateTry(args: Array<String>) {
    println("${if (args[0].toInt() < 12) "Good Morning, Kotlin" else "Good night, Kotlin"}")
}