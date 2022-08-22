package Maji
fun main() {
    val spices1 = listOf(
        Spices("curry", "mild"),
        Spices("pepper", "medium"),
        Spices("cayenne", "spicy"),
        Spices("ginger", "mild"),
        Spices("red curry", "medium"),
        Spices("green curry", "mild"),
        Spices("hot pepper", "extremely spicy")
    )

    val spice = Spices("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}
    fun makeSalt() = Spices("Salt")
}
