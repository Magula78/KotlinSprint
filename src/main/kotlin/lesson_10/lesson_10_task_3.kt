package lesson_10

import kotlin.random.Random

fun main() {
    generationPassword()
}

fun generationPassword() {
    println("Введите длину сиволов пороля для генерации")
    val digit = readln().toInt()
    val lengthPassword = digit
    val random = Random
    val symdols = "${'A'..'Z'}" + "${'a'..'z'}" + "123456789" + "!#$%'()*+,-./" + "" + " "
    val bulder = StringBuilder()
    println(symdols.random())

    for (i in 0 until lengthPassword) {
        bulder.append(symdols[random.nextInt(symdols.length)])

    }
    println(bulder)
    val randomString = bulder.toString()
    println(randomString)

}