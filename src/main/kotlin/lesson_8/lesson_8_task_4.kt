package lesson_8

fun main() {
    var indigrientsSup = arrayOf("вода", "кортошка", "макароны", "соль", "лук", "морковь", "зелень", "масло")
    println("Индигриенты блюда:")
    for (i in indigrientsSup.indices) {
        println(indigrientsSup[i])
    }
    println("Какой индигриент вы хотите заменить в рецепте блюда. Введите:")
    var oldIndigrient = readln()
    val availability = indigrientsSup.contains(oldIndigrient)
    if (availability == false) {
        println("Этого индигриента нет в рецепте")
    }

    for (i in indigrientsSup) {
        if (i == oldIndigrient) {
            println("Заменить индигриент ($oldIndigrient) в рицепте блюда возможно. Данный индигриент есть")
            println("Введите название нового индигриента, чтобы заменить индигриент ($oldIndigrient):")
            var changeIndigrient = readln()
            indigrientsSup[indigrientsSup.indexOf(i)] = changeIndigrient
        }

    }
    if (availability == true) {
        println("Обновленный рецепт блюда:")
        for (i in indigrientsSup.indices) {
            println("${indigrientsSup[i]}")
        }
    }
}