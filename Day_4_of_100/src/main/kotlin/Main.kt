fun main() {
    println("You fortune is: ${getFortuneCookies()}")
    getFortuneCookies()
}

fun getFortuneCookies(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today",
        "Enjoy a wonderful day of success",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune",
        "You are strong"
    )
    print("\nEnter you birthday: ")
    var birthday = readLine()?. toIntOrNull()?:1
    return fortunes[birthday.rem(fortunes.size)]

}
