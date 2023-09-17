package lesson5

fun main() {
    println("Здравствуйте! Вход в ситему!")
    println("Автоизация. Если вы не БОТ решите простой пример:")
    println("1+1 = ?")
    println("Введите ответ:")

    var ansver = readLine()!!.toInt()

    if (ansver == 2) println("Добро пожаловать!") else println("Доступ запрещен")
}