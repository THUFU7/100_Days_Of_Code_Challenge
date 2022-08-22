import java.time.DayOfWeek
import java.util.*

// Today I learnt about the following: Comparison & Logical operators, while, do-while, labels, if/else and functions.
fun main() {
    fun daysOfWeek(){
        println("What day is it today?")
        val calender = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        when(calender){
            1-> println("Sunday")
            2-> println("Monday")
            3-> println("Tuesday")
            4-> println("Wednesday")
            5-> println("Thursday")
            6-> println("Friday")
            7-> println("Saturday")
        }
    }
    daysOfWeek()
}
