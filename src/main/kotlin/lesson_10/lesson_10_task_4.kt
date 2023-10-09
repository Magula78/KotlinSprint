package lesson_10

import kotlin.random.Random

fun main() {

        println("Игра начата")
    val counterVictoriesKiber = mutableListOf<Int>()
    val counterVictoriesHuman= mutableListOf<Int>()
    var counterRound = 0

    do {
        val resultRound = round()
        counterRound++
        println("Желаете продолжить игру?")
         var ansver = readln()

        if (resultRound==1){counterVictoriesHuman.add(1)}
        if (resultRound==0){counterVictoriesKiber.add(1)}

        val victoriesKiber = counterVictoriesKiber.sum()
        val victoriesHuman = counterVictoriesHuman.sum()
        println("Рузультаты прошлой игры номер${counterRound}")
        println("Число побед раундов у KIBER: $victoriesKiber")
        println("Число побед раундов у HUMAN: $victoriesHuman")
    }
    while (ansver.contains("да", ignoreCase = true))
println("Число сыгранных раундов: $counterRound")
    }

fun round():Int {
    var winnerHuman:Int=0
    println("Ход игрока: Человек")
    val resultHuman = progresOfGame()

   println("Ход игрока : Кибер ")
    val resulKiber = progresOfGame()

    if (resultHuman > resulKiber) {
       println("Победил Человек")
        var winnerHuman:Int = 1
        return winnerHuman
    }
    if (resultHuman < resulKiber) {
       println("Победил KIBER")
        var winnerHuman:Int = 0
        return winnerHuman
    }
    if (resultHuman == resulKiber) {
        println("НЕЧЬЯ")
    }
        return winnerHuman
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


