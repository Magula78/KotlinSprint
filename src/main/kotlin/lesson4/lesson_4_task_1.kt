package lesson4

fun main() {

    val freeTodayTable = 13
    val freeTomorrowTable = 4

    val ansverTodey = freeTodayTable < TOTAL_TABLES
    val ansverTommorow = freeTomorrowTable < TOTAL_TABLES

    println("Доступность столиков на сегодня:$ansverTodey, Доступность столиков на завтра $ansverTommorow")

}

const val TOTAL_TABLES = 13
