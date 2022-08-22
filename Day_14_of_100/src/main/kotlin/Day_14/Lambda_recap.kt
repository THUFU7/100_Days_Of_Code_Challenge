package Day_14
//Create a new file.
//Create an enum class, Directions, that has the directions NORTH, SOUTH, EAST and WEST, as well as START, and END.
//Create a class Game.
//Inside Game, declare a var, path, that is a mutable list of Direction. Initialize it with one element, START.
//Create 4 lambdas, north, south, east, and west, that add the respective direction to the path.
//Add another lambda, end, that:
//Adds END to path
// Prints “Game Over”, Prints the path, Clears the path, Returns false
//Create a main function.
//Inside main(), create an instance of Game.
//To test your code so far, in main() print the path, then invoke north, east, south, west, and end. Finally, print the path again.

enum class Directions {
    NORTH, SOUTH, EAST, WEST,START, END
}
class Game{
    var path = mutableListOf<Directions>(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {path.add(Directions.END)
    println("Game Over: $path")
        path.clear()
        false
    }
}