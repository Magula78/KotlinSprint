package lesson_12


class Weather2(daytimeTemperature: Int, nightTemperature: Int, presencePrecipitation: Boolean) {
    var daytimeTemperature: Int = daytimeTemperature
    var nightTemperature: Int = nightTemperature
    var presencePrecipitation: Boolean = presencePrecipitation

    fun reportOfWeather() {
        println("Отчет по погоде:")
        println("Дневная температура ${daytimeTemperature}")
        println("Ночная температура ${nightTemperature}")
        println("Наличие осадков  ${presencePrecipitation}")
    }
}

fun main() {
    val november6 = Weather2(
        daytimeTemperature = 12,
        nightTemperature = 0,
        presencePrecipitation = true,
    )

    november6.reportOfWeather()
}