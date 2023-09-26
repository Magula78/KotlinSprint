package lesson_7

import kotlin.random.Random

fun main() {
    for (i in 1..1000) {
        println("Код из СМС сообщения:")
        var sms = (1000..9999).random()
        println(sms)
        println("Введите СМС в программу авторизации:")
        var ansverSms = readln().toInt()

        if (ansverSms == sms) {
            println("Добро пожаловать")
            return
        }
        println("Код из СМС  введен не верно")
    }

}