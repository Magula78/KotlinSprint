package lesson_9

fun main() {
    val indigrientsSup = mutableListOf("вода", "кортошка", "макароны")
    println("Блюдо имеет базовые ингредиенты:$indigrientsSup")
    println("Желаете добавить еще ингредиенты?")
    var ansver = readln()

    if (ansver.contains("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добваить ?")
        var foodNew = readln()
        indigrientsSup.add(foodNew)
        println("Теперь в блюде есть следующие ингредиенты:$indigrientsSup")
    } else {
        return
    }


}