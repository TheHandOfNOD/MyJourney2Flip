package advanced

import java.time.Year

fun main() {
    val (title, author, year) = Book("The bible", "jesus", Year.of(2007))
    println("Here is your book '$title' written by '$author' in $year")

    val book = Book("Babyjahre", "Remo H. Largo", Year.of(2009))
    val whoWroteWhat = book.whoWroteWhat()
    val whatIsThisBookAtAll = book.whatIsThisBookAtAll()

    println("Here is your book '${whoWroteWhat.first}' written by ${whoWroteWhat.second}") // access via the Pair
    println("Here is your book '${whatIsThisBookAtAll.first}' written by ${whatIsThisBookAtAll.second} in ${whatIsThisBookAtAll.third}") // acces via the Triple
}

class Book (val title: String, val author: String, val year: Year) {
    fun whoWroteWhat(): Pair<String, String> = title to author
    fun whatIsThisBookAtAll(): Triple<String, String, Year> = Triple(title, author, year)
    // the following operator functions are created automatically if you use a "data" class
    operator fun component1() = title
    operator fun component2() = author
    operator fun component3() = year
}