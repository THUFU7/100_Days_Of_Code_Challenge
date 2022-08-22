fun main(args: Array<String>) {
    //Strings
    val words = "I am Robert Mungai and I am 23 years old"
    println("The string is: ${words.toUpperCase().reversed()}")
    //Logical and comparison operators
    val simple = 3>4||4>3&&4<=4
    println(simple)
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hard = !(x!=z)&&bool||z>(x+y)&&(!bool||y<z)
    println(hard)
    //conditions
    var name = "CIVIC"
    var palindrome = if (name.reversed() == name) println("This is a palindrome") else println("This is not a palindrome")
    //null values and user input
    print("Enter your age:")
    val age = readLine()?.toInt()
    if (age != null) {
        if (age >= 0 && age <= 18)
            println("You are not an adult")
        else if (age >= 19 && age <= 35)
            println("You are an adult")
        else
            println("You are really old")
    }

}