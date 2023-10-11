package lesson_10

import kotlin.random.Random

fun main() {
    println("Придумайте ЛОГИН Для этого введите не менее 4 символов")
    val generationLogin = generationLogin()
    println("ВАШ ПОРОЛЬ сгенирируется автоматически. Пожайлуста подождите.")
    val generationPassword = generationPassword1()
    println("Пожайлуста пройдите авторизацию")
    var authorizationLogin = authorizationLogin()
    while (authorizationLogin != generationLogin)
        authorizationLogin = readln()

    var authorizationPassword = authorizationPassword()
    while (authorizationPassword != generationPassword)
        authorizationPassword = readln()
    println("Внимание для окончания авторизации введите код в программу из сообщения из СМС")
    smsKod()

}

fun generationLogin(): String {

    var login = readln()
    var lengtlLogan = login.length
    while (lengtlLogan < 4) {
        println("ЛОГИН недостаточной длинны")
        println("введите не менее 4 символов")
        login = readln()
        lengtlLogan = login.length

    }
    println("Логин сгенерирован")
    println(lengtlLogan)
    println(login)
    return login
}

fun generationPassword1(): String {
    println("Сгенирироваггый пороль будеть содержать 4 цыфры")
    var sizePassword = 4
    val range = 1..sizePassword
    var password = ""

    for (i in range) {
        var a = (('A'..'Z') + ('a'..'z') + ('1'..'9')).random().toString()
        password = "$password$a"

    }
    println("Пожайлуста запомните Ваш ПОРОЛЬ: $password")
    return password
}

fun smsKod() {
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

fun authorizationLogin(): String {

    println("Для входа в приложение введите ваш ЛОГИН")
    println("ваш ЛОГИН:")
    var login = readln()
    return login
}

fun authorizationPassword(): String {
    println("Для входа в приложение введите ваш ПОРОЛЬ")
    println("ваш ПОРОЛЬ:")
    var password = readln()
    return password
}


