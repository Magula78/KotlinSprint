package lesson_9

fun main() {

    println("Введите пять ингредиентов блюда в одной стокеБ через запятую без пробелов")
    val dataInput = readLine().toString()

    val listFoods: List<String> = listOf(*dataInput.split(",").toTypedArray())

    val sortedListFoods = listFoods.sorted()
    println(sortedListFoods)

}