package lesson_5

import kotlin.random.Random

fun main() {
    println("Лоторея")
    println("Введите по запросу два любых числа в диапозоне от 1 до 100")
    val randomNum1 = Random.nextInt(1, 100)
    val randomNum2 = Random.nextInt(1, 100)

    println("Введите первое число")
    val attempt1 = readLine()?.toInt() ?: 0
    val attempt2 = readLine()?.toInt() ?: 0
    if ((attempt1 == randomNum1 || attempt1 == randomNum2) && (attempt2 == randomNum1 || attempt2 == randomNum2)) {
        println("Поздравляю вы выйграли главный приз!")
    } else if ((attempt1 != randomNum1 && attempt1 != randomNum2) && (attempt2 != randomNum1 && attempt2 != randomNum2)) {
        println("неудача!")
    } else {
        println("Утешительный приз!")
    }
    println("Отчет: случайное число 1:$randomNum1/ответ:$attempt1")
    println("Отчет: случайное число 2:$randomNum2/ответ:$attempt2")

}

