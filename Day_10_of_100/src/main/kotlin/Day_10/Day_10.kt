//Create a top-level constant for the maximum number of books a person could borrow.
//Inside the Book class, create a method canBorrow() that returns true or false depending on whether a user has already borrowed the max number of books.
//Create a Constants object that provides constants to the book. For this example, provide the BASE_URL for all books in the library catalog. Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL, the book title, and “.html”.
//The base URL is really of interest to the Book class. As such, it makes sense to limit its scope to the Book class. Use a companion object to define the constant in Book.
package Day_10

import kotlin.random.Random

const val maximumBooks =  100
object Constants {
    const val BASE_URL = "www.library.com/"
}
//Extension function
fun Book.getWeight(): Double{
    return 1.5 * pages
}
fun Book.tornPages(tornPages: Int){
    pages -= tornPages
}
fun Book.printNumOfPages(){
    println("Number of pages: $pages")
}
class Puppy(){
    fun playWithBook(book: Book){
        val randPagesToTorn = Random.nextInt(1, book.pages + 1)
        book.tornPages(randPagesToTorn)
    }
}
class Book(val title: String,
             val author: String,
             val year: Int,
             val maxBooks: Int = 0,
           var pages: Int = 0)
{
    companion object BookURL{
        const val BASE_URL = "www.library.com/"
    }
    fun printUrl(){
        println(Constants.BASE_URL + "/"
        + title + "/"
        + author +  "/"
        + year + "/"
        + ".html"
        )
    }
    fun getTitleAuthor(): Pair<String, String>{
        return Pair(title, author)
    }
    fun getTitleAuthorYear(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }
    fun canBorrow(): Boolean{
        return maxBooks < maximumBooks
    }
}