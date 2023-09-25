package lesson_7

import kotlin.random.Random

fun main() {
    for (i in 1..1000) {
        println("Это код из СМС сообщения:")
        var sms = Random.nextInt(1, 9)
        println(sms)
        println("Введите СМС в программу авторизации:")
        var ansverSms = readLine()?.toInt() ?: 0

        if (ansverSms == sms) {
            println("Добро пожаловать")
            return
        }
        println("Код из СМС  введен не верно")
    }

}