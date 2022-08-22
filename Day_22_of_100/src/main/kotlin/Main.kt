fun main(args: Array<String>) {
    //arrays
    var myArray = arrayOf("You", "are", "so", "blessed")
    println(myArray[2])
    //while loop
    var x = 4
    while (x>0) {
        println("HELLO")
        x--
    }
    println("Whats up")
    //homework
    print("Please enter a number: ")
    var number = readLine()?.toInt()
    while (number != null && number>=0){
        println(number)
       number--
   }
    //homework
    print("Enter the first number: ")
    var num1 = readLine()?.toInt()
    print("Enter the second number: ")
    var num2 = readLine()?.toInt()
    var result = 1
    var i = 0
    while (num1 != null && num2 != null && i<num2){
        result *= num1
        i++
    }
    println("$num1 to the power of $num2 is : $result")
}