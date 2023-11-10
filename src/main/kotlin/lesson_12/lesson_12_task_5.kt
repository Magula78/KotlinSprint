package lesson_12

import kotlin.random.Random

class Weather5() {
    var daytimeTemperature: Int = 280
        get() = field - 273
    var nightTemperature: Int = 275
        get() = field - 273
    var presencePrecipitation: Boolean = false

}

fun main() {
    val wetherOfnovember = Weather5()
    val listNightTemperature = mutableListOf<Int>()
    val listDayTemperature = mutableListOf<Int>()
    val listPrecipitation = mutableListOf<Boolean>()


    for (i in 1..30) {
        wetherOfnovember.nightTemperature = Random.nextInt(260, 285)
        listNightTemperature.add(wetherOfnovember.nightTemperature)
        wetherOfnovember.daytimeTemperature = Random.nextInt(265, 293)
        listDayTemperature.add(wetherOfnovember.daytimeTemperature)
        wetherOfnovember.presencePrecipitation = Random.nextBoolean()
        listPrecipitation.add(wetherOfnovember.presencePrecipitation)

    }

    println("Средняя дневная температура воздуха: ${listDayTemperature.average()} градусов Цельсия")
    println("Средняя ночная температура воздуха: ${listNightTemperature.average()} градусов Цельсия")
    fun negativeList(listPrecipitation: MutableList<Boolean>) = listPrecipitation.filter { it == true }
    println("Количестьво дней с осадками: ${(negativeList(listPrecipitation)).size} дней")

}