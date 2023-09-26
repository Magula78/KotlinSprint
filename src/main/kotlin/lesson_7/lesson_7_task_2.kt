package lesson_7

import kotlin.random.Random

fun main() {
    for (i in 1..1000) {
        println("Код из СМС сообщения:")
        var sms = Random.nextInt(1000, 9999)
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