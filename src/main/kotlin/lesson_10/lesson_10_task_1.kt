package lesson_10

import kotlin.random.Random

fun main() {
    println("Игра начата")

    println("Ход игрока: Человек")
    val resultHuman = progresOfGame()

    println("Ход игрока : Кибер ")
    val resulKiber = progresOfGame()

    if (resultHuman > resulKiber) {
        println("Победил Человек")
    }
    if (resultHuman < resulKiber) {
        println("Победил KIBER")
    }
    if (resultHuman == resulKiber) {
        println("НЕЧЬЯ")
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


