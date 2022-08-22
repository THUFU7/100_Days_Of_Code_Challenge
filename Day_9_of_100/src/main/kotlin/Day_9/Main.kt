package Day_9
//Create a Set of book titles called allBooks, for example, by William Shakespeare.
//Create a Map called library that associates the set of books, allBooks, to the author.
//Use the collections function any() on library to see if any of the books are “Hamlet’
//Create a MutableMap called moreBooks, and add one title/author to it.
//Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
fun main(args: Array<String>) {
    val allBooks = setOf("MacBeth", "Romeo and Juliet", "Hamlet")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any{it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf<String, String>("Rational male" to "Rollo Tomassi")
    moreBooks.getOrPut("Jungle Book"){"Kipling"}
    moreBooks.getOrPut("Hamlet"){"Shakespeare"}
    println(moreBooks)

    val book = Book("Think and Grow Rich", "Napoleon Hill", "1963")
    val bookTitleAuthor = book.getTitleAndAuthor()
    val bookTitleAuthorYear = book.getTitleAndAuthorAndYear()
    println("Your book is ${bookTitleAuthor.first} written by ${bookTitleAuthor.second}")
    println("Your book is ${bookTitleAuthorYear.first} written by ${bookTitleAuthorYear.second} and was published in ${bookTitleAuthorYear.third}")

}