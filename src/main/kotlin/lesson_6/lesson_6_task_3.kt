package lesson_6

fun main() {
    println("Введите количество секунд от которых вести отчет:")
    var timing = readLine()?.toInt() ?: 0

    while (timing > 0) {
        println("Осталось ${timing--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}