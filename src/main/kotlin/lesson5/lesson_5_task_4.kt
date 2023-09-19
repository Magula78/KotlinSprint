package lesson5

fun main(){

    println("Добро пожаловать. Вас приветсвует робот - андроид Марвин")
    println("Для Вашей верификации, введите свои данные")

    println("Введите ЛОГИН")
    val login = readln()

    println("Введите ПОРОЛЬ")
    val porol = readln()

    if (login == LOGIN){}
    if (porol == POROL) {println("Ваши данные проверены, входите в корабль HEART OF GOLD")
    }else {println("Вы вели не верные данные. Пройдите пожайлуста регистрацию тут")
        println("Придумайте ЛОГИН из букв и введите:")
        val login2 = readln()
        println("Придумайте ПОРОЛЬ из букв и введите:")
        val porol2 = readln()
        println("Спасибо $login2 запомните ваш пороль $porol2, регистрация завершина - проходите на корабль HEART OF GOLD")
        }
    }
const val LOGIN = "Zaphod"
const val POROL = "PanGalactic"