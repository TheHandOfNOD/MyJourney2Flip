package advanced

import java.time.Year
import kotlin.random.Random

fun main() {
    val (title, author, year) = Book("The bible", "jesus", Year.of(2007), 1000)
    println("Here is your book '$title' written by '$author' in $year")

    val book = Book("Babyjahre", "Remo H. Largo", Year.of(2009), 200)
    val whoWroteWhat = book.whoWroteWhat()
    val whatIsThisBookAtAll = book.whatIsThisBookAtAll()

    println("Here is your book '${whoWroteWhat.first}' written by ${whoWroteWhat.second}") // access via the Pair
    println("Here is your book '${whatIsThisBookAtAll.first}' written by ${whatIsThisBookAtAll.second} in ${whatIsThisBookAtAll.third}") // acces via the Triple

    val puppy = Puppy()
    puppy.playWithBook(book)
}

class Book (val title: String, val author: String, val year: Year, var pages: Int = 1) {
    fun whoWroteWhat(): Pair<String, String> = title to author
    fun whatIsThisBookAtAll(): Triple<String, String, Year> = Triple(title, author, year)
    // the following operator functions are created automatically if you use a "data" class
    operator fun component1() = title
    operator fun component2() = author
    operator fun component3() = year
}

fun Book.weight(): Double = pages * 1.5
fun Book.tornPages(tornPages: Int) {
    pages = pages - tornPages
    println("${weight()} left")
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random(2).nextInt(1, 7))
    }
}
