package lesson_7

import kotlin.random.Random

fun main() {
    val range1 = 1..9
    val randomNum1 = range1.random()
    val range2 = 'a'..'z'
    val randomNum2 = range2.random()
    val range3 = 1..9
    val randomNum3 = range3.random()
    val range4 = 'a'..'z'
    val randomNum4 = range4.random()
    val range5 = 1..9
    val randomNum5 = range5.random()
    val range6 = 'a'..'z'
    val randomNum6 = range6.random()

    val porol = "$randomNum1" + "$randomNum2" + "$randomNum3" + "$randomNum4" + "$randomNum5" + "$randomNum6"
    println(porol)

}
