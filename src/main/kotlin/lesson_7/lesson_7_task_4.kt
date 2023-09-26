package lesson_7

fun main() {
    println("Введите количество секунд которые нужно засечь:")

    var timing = readln().toInt()

    for (i in timing downTo 1) {
        println("Осталось ${timing--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}