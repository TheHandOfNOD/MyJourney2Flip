open class Book (val title: String, val author: String) {
    private var currentPage: Int = 0
    open fun readPage(): Any = currentPage++

}

class EBook(title: String, author: String, currentPage: Int = 0, format: String = "text") : Book(title, author) {
    private var wordsRead = 0;
    override fun readPage() {
        wordsRead += 250
    }

}