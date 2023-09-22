package lesson_6

fun main() {

    println("Здравствуйте создайте ЛОГИН и ПОРОЛЬ")
    println("Придумайте ЛОГИН и введите его:")
    var login = readln()

    println("Придумайте ПОРОЛЬ из букв и введите его:")
    var porol = readln()
    println("OК Вы зарегистрировались в приложении")
    println("Для входа в приложение введите ваш ЛОГИН и ПОРОЛЬ:")
    println("ваш ЛОГИН:")
    var login1 = readln()
    println("ваш ПОРОЛЬ:")
    var porol1 = readln()

    while (login1 != login)
        login1 = readln()
    while (porol1 != porol)
        porol1 = readln()

    println("Авторизация прошла успешно")
    println("Добро пожаловать в приложение")

}