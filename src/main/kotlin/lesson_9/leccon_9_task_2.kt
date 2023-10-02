package lesson_9

fun main() {
    val indigrientsSup = mutableListOf("вода", "кортошка", "макароны")
    println("Блюдо имеет базовые ингредиенты:$indigrientsSup")
    println("Желаете  добавить еще индигриенты?")
    var ansver = readLine()
    if (ansver != "Да" && ansver != "да") {
        return
    }
    if (ansver == "Да" || ansver == "да") {
        println("Какой ингредиент вы хотите добваить ?")
        var foodNew = readln()
        indigrientsSup.add(foodNew)
        println("Теперь в блюде есть следующие ингредиенты:$indigrientsSup")
    }

}