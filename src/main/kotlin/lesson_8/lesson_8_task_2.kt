package lesson_8

fun main() {
    val indigrientsSup = arrayListOf("вода", "кортошка", "макароны", "соль", "лук", "морковь", "зелень", "масло")
    println("Введите название индигриента в блюде: ")
    val findIndigrient = readln()

    for (i in indigrientsSup) {
        if (i == findIndigrient) {
            println("Индигриент ($findIndigrient) в рицепте блюда есть")
            return
        }
    }
    println("Такого индигриента нет.")
}