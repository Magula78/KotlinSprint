package lesson_10

fun main() {
    valid()
}

fun valid() {
    println("Придумайте ЛОГИН Для этого введите не менее 4 символов")
    val login = readln()

    println("Придумайте Пороль Для этого введите не менее 4 символов")
    val password = readln()

    if (login.length < 4 || password.length < 4) {
        println("ЛОГИН или ПОРОЛЬ недостаточно длинные")
    } else {
        println("Авторизация завершена успешно")
    }
}

