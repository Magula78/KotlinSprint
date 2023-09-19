package lesson5

fun main() {
    println("Здравствуйте! Вход в ситему!")
    println("Автоизация. Если вы не БОТ решите простой пример на сложение:введите последовательно два числа и дайте ответ")
    println("Введите первое число")
    var number1 = readLine()!!.toInt()
    println("Введите второе число")
    var number2 = readLine()!!.toInt()
    println("Введите ответ:")
    var ansver = readLine()!!.toInt()
    var sum = number1 + number2

    if (ansver == sum) println("Добро пожаловать!") else println("Доступ запрещен")
}