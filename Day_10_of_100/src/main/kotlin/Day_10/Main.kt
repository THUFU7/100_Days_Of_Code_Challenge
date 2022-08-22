package Day_10
fun main(args: Array<String>) {
    val book = Book("Rational Male", "Rollo Tomassi", 2018)

    val (title, author) = book.getTitleAuthor()
    val (title1, author1, year) = book.getTitleAuthorYear()

    println("Here is your book ${book.title} written by ${book.author} in ${book.year}")

    book.pages = 100
    val pupy = Puppy()
    while (book.pages > 0){
        pupy.playWithBook(book)
        book.printNumOfPages()
    }
}