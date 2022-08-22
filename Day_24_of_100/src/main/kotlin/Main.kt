fun main(args: Array<String>) {
    val myArray = arrayOf(2,4,5,3,92,23,455,34)
    var max = myArray[0]
    for (i in myArray){
        if (i > max) {
            max = i
        }
    }
    println(max)
    //homework one
    var myNewArray = arrayOf(2,4,5,2,3,5)
    var sum = 0
    for (item in myNewArray){
        sum +=item
    }
    println("The sum of the array is $sum")
    //homework two
    println("Enter 5 numbers: ")
    var average = 0.0
    for (newItem in 1..5){
        var numbers = readLine()?.toInt()
        if (numbers != null){
            average += numbers/ 5.0
        }
    }
    println("The average of the numbers is $average")
}