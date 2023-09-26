package lesson_6

import kotlin.random.Random

fun main() {
    println("Авторизация: У Вас три попытки для авторизации")
    println("Если вы не БОТ решите три простых примера:")
    var randomNum1 = Random.nextInt(1, 9)
    var randomNum2 = Random.nextInt(1, 9)
    println("Решите пример: $randomNum1 + $randomNum2")
    var result = randomNum1 + randomNum2
    var attempt = 1
    println("Попытка: $attempt")
    println("Введите ответ:")
    var ansver = readLine()?.toInt() ?: 0

    while ((ansver != result) && (attempt < 3)) {
        attempt = attempt + 1
        println("Неправильный ответ")
        println("Попытка: $attempt")
        randomNum1 = Random.nextInt(1, 9)
        randomNum2 = Random.nextInt(1, 9)
        println("Решите пример: $randomNum1 + $randomNum2")
        result = randomNum1 + randomNum2
        println("Введите ответ:")
        ansver = readLine()?.toInt() ?: 0
    }

    if ((ansver == result)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}
