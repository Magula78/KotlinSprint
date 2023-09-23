package lesson_6

import kotlin.random.Random

fun main() {
    println("Игра: У Вас пять попыток, чтобы отгадать число от 1 до 9:")
    println("Игра началась. Введите число ")
    var randomNum = Random.nextInt(1, 9)
    println("randomNum= $randomNum")
    var num = 1
    println("Попытка: $num")
    var numberTry = readLine()?.toInt() ?: 0
    var nu1 = numberTry

    while ((numberTry != randomNum) && (num < TRY)) {
        num = num + 1
        println("Неверно")
        println("Попытка: ${num}")
        numberTry = readLine()?.toInt() ?: 0
    }

    var nu2 = numberTry

    println("Было загадано число: $randomNum")

    if ((nu1 == randomNum) || (nu2 == randomNum)) {
        println("Это была великолепная игра")
    } else {
        println("Вы не угадали число")
    }

}

const val TRY = 5