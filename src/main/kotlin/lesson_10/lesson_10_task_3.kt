package lesson_10

import kotlin.random.Random

fun main() {
    generationPassword()
}

fun generationPassword() {
    println("Введите длину сиволов пороля для генерации")
    val digit = readln().toInt()
    val lengthPassword = digit
    val symbols1 = "!#$%'()*+,-./"
    val digit1 = 1..9
    var generationPassword = ""

    for (i in 0 until lengthPassword - 2) {

        generationPassword = generationPassword + symbols1.random() + digit1.random()

    }
    println(generationPassword)


}