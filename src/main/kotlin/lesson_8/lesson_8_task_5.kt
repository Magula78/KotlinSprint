package lesson_8

fun main() {
    println("Введите число индигриентов рецепта создоваемого блюда")
    val sizeArray = readln().toInt()

    val indexArray = sizeArray - 1
    val foodArray = arrayOfNulls<String>(sizeArray)

    for (i in 0..indexArray) {
        println("Введите название индигриента ${i + 1} массив")
        val element = readln()
        foodArray[i] = "$element"

    }
    println("Рецепт блюда:")
    foodArray.forEachIndexed { index, char -> println("Индигриент ${index + 1} Продукт: $char") }


}