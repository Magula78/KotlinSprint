package lesson_9

fun main() {

    println("Введите пять ингредиентов блюда в одной стоке через запятую без пробелов")
    val dataInput = readLine().toString()

    val sortedListFoods = dataInput.split(",").sorted()

    println(sortedListFoods)


}