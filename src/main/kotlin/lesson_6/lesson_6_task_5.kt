package lesson_6

import kotlin.random.Random

fun main() {
    println("Авторизация: У Вас три попытки для авторизации")
    println("Если вы не БОТ решите три простых примера:")
    var randomNum1 = Random.nextInt(1, 9)
    var randomNum2 = Random.nextInt(1, 9)
    println("Решите пример: $randomNum1 + $randomNum2")
    var result1 = randomNum1+randomNum2
    var num = 1
    println("Попытка: $num")
    println("Введите ответ:")
    var ansver = readLine()?.toInt() ?: 0


    var nu1 = ansver

    while ((ansver != result1) && (num < TRY)) {
        num = num + 1
        println("Неправильный ответ")
        println("Попытка: $num")
        randomNum1 = Random.nextInt(1, 9)
        randomNum2 = Random.nextInt(1, 9)
        println("Решите пример: $randomNum1 + $randomNum2")
        result1 = randomNum1+randomNum2
        println("Введите ответ:")
        ansver = readLine()?.toInt() ?: 0
    }

    var nu2 = ansver

    if ((nu1 == result1) || (nu2 == result1)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}
const val TRY = 3