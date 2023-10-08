package lesson_10

fun main() {
    valid()
}

fun valid() {
    println("Придумайте ЛОГИН Для этого введите не менее 4 символов")
    val login = readln()
    val lengtlLogan = login.length

    println("Придумайте Пороль Для этого введите не менее 4 символов")
    val password = readln()
    val lengtlPasword = password.length

    if (lengtlLogan < 4 || lengtlPasword < 4) {
        println("ЛОГИН или ПОРОЛЬ недостаточно длинные")
    } else {
        println("Авторизация завершена успешно")
    }
}

