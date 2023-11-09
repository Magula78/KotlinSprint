package lesson_12
class Weather4() {
    var daytimeTemperature: Int = 280
        get() = field - 273
    var naightTemperature: Int = 275
        get() = field - 273
    var presencePrecipitation: Boolean = false

    fun reportOfWeather() {

        println("Отчет по погоде с конвертацией температуры в Цельсия")

        println("Дневная температура ${daytimeTemperature}С'")
        println("Ночная температура ${naightTemperature}С'")
        println("Наличие осадков  ${presencePrecipitation}")
    }
}

fun main() {
    var november7 = Weather4()
    november7.reportOfWeather()
}