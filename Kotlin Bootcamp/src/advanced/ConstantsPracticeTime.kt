package advanced

import java.time.Year

const val MAX_NUMBER_OF_BOOKS = 25

class BookPractice(val title: String, val author: String, val year: Year) {
    fun canBorrow(user: User): Boolean {
        if (user.countBooksRented < MAX_NUMBER_OF_BOOKS)
            return true
        else
            return false
    }

    fun printUrl() {
        println("${BOOK_CONSTANTS.BASE_URL}/$title/.html")
    }

    companion object BOOK_CONSTANTS {
        const val BASE_URL = "https://library.catalog"
    }
}

class User(val name: String, var countBooksRented: Int = 0) {
    fun increaseRentedBooksCount() = countBooksRented++
}

object CONSTANTS {
    const val BASE_URL = "https://library.catalog/"
}