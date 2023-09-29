package lesson_8

fun main() {
    var indigrientsSup = arrayOf("вода", "кортошка", "макароны", "соль", "лук", "морковь", "зелень", "масло")
    println("Индигриенты блюда:")
    for (i in indigrientsSup.indices) {
        println(indigrientsSup[i])
    }
    println("Какой индигриент вы хотите заменить в рецепте блюда. Введите:")
    var oldIndigrient = readln()
    if (indigrientsSup.contains(oldIndigrient)) {
        for (i in indigrientsSup) {

            if (i == oldIndigrient) {
                println("Заменить индигриент ($oldIndigrient) в рицепте блюда возможно. Данный индигриент есть")
                println("Введите название нового индигриента, чтобы заменить индигриент ($oldIndigrient):")
                var changeIndigrient = readln()
                indigrientsSup[indigrientsSup.indexOf(i)] = changeIndigrient
                println("Обновленный рецепт блюда:")
                for (i in indigrientsSup.indices) {
                    println("${indigrientsSup[i]}")
                }
            }

        }
    } else {
        println("Этого индигриента нет в рецепте")
    }

}