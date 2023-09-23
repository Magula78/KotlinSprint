package lesson_6

fun main() {
    println("Введите количество секунд которые нужно засечь:")
    var starTeming = 1
    var timing = readLine()?.toInt() ?: 0

    do {
        println("Прошло ${starTeming++} секунд")
        Thread.sleep(1000)
    } while (starTeming <= timing)
}