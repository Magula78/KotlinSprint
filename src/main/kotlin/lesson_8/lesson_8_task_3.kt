package lesson_8

fun main() {
    val indigrientsSup = arrayOf("вода", "кортошка", "макароны", "соль", "лук", "морковь", "зелень", "масло")
    println("Введите название индигриента в блюде:")
    val findIndigrient = readln()
    val search = indigrientsSup.contains(findIndigrient)

    if (search == true) {
        println("Индигриент ($findIndigrient) в рецепте блюда есть")
        return
    }
    println("Индигриента в блюде нет")
}