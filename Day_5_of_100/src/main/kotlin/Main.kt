import kotlin.random.Random
//Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
//Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
//If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
//Create a new variable, rollDice2, for this same lambda using the function type notation.
fun main(args: Array<String>){
    val rollDice = {Random.nextInt(12) + 1}
    val rollDice1 = { sides: Int ->
        if (sides == 0 )0
        else Random.nextInt(sides) + 1}
    repeat(10){
        print("${rollDice1(0)}")
    }
    val rollDice2 : (Int) -> Int = {sides: Int ->
        if (sides == 0)0
        else Random.nextInt(sides) + 1
    }
}