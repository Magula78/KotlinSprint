package lesson_8

fun main() {
    val indigrientsSup = arrayOf("вода", "кортошка", "макароны", "соль", "лук", "морковь", "зелень", "масло")
    println("Введите название индигриента в блюде: ")
    val findIndigrient = readln()
    if (indigrientsSup.contains(findIndigrient)) {
        println("Индигриент ($findIndigrient) в рецепте блюда есть")
        return
    }
    println("Индигриента в блюде нет")
}