package lesson_10

import kotlin.random.Random

fun main() {

    println("Игра начата")
    var counterVictoriesKiber: Int = 0
    var counterVictoriesHuman: Int = 0
    var counterRound = 0

    do {
        val resultRound = winnerHuman()
        counterRound++
        println("Желаете продолжить игру?")
        var ansver = readln()

        if (resultRound == true) {
            counterVictoriesHuman = counterVictoriesHuman + 1
        }
        if (resultRound == false) {
            counterVictoriesKiber = counterVictoriesKiber + 1
        }

        var victoriesKiber = counterVictoriesKiber
        var victoriesHuman = counterVictoriesHuman
        println("Рузультаты прошлой игры номер${counterRound}")
        println("Число побед раундов у KIBER: $victoriesKiber")
        println("Число побед раундов у HUMAN: $victoriesHuman")
    } while (ansver.contains("да", ignoreCase = true))
    println("Число сыгранных раундов: $counterRound")
}

fun winnerHuman(): Boolean {

    println("Ход игрока: Человек")
    val resultHuman = progresOfGame()

    println("Ход игрока : Кибер ")
    val resulKiber = progresOfGame()

    // if (resultHuman > resulKiber) {
    return when {
        resultHuman > resulKiber -> {
            println("Победил Человек")
            true
        }

        resultHuman < resulKiber -> {
            println("Победил KIBER")
            false
        }

        else -> {
            println("НИЧЬЯ")
            false
        }
    }
}

fun progresOfGame(): Int {
    var cube1 = Random.nextInt(1, 6)
    var cube2 = Random.nextInt(1, 6)
    var sumCube12 = cube1 + cube2
    println("Число с 1 кубика:$cube1")
    println("Число c 2 кубика:$cube2")
    println("Сумма чисел ${cube2 + cube1}")
    return sumCube12

}


