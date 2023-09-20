package lesson__5

fun main() {
    println("Лоторея")
    println("Введите по запросу два любых числа в диапозоне от 1 до 100")

    println("Введите первое  число")
    val attempt1 = readLine()?.toInt() ?: 0
    val attempt2 = readLine()?.toInt() ?: 0
    if ((attempt1 == ANSVER_1 || attempt1 == ANSVER_2) && (attempt2 == ANSVER_1 || attempt2 == ANSVER_2)) {
        println("Поздравляю вы выйграли главный приз!")
    } else if ((attempt1 != ANSVER_1 && attempt1 != ANSVER_2) && (attempt2 != ANSVER_1 && attempt2 != ANSVER_2)) {
        println("неудача!")
    } else {
        println("Утешительный приз!")
    }

}

const val ANSVER_1 = 3
const val ANSVER_2 = 34