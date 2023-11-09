package lesson_12

class Weather3() {
    var daytimeTemperature: Int = 280
        get() = field - 273
    var naightTemperature: Int = 275
        get() = field - 273
    var presencePrecipitation: Boolean = false

    fun reportOfWeather() {

        println("Отчет по погоде с конвертацией температуры в Цельсия")
        println("Введите значения дневной температуры в Кельвинах")
        var t1 = readln().toInt()
        daytimeTemperature = t1
        println("Введите значения ночной температуры в Кельвинах")
        var t2 = readln().toInt()
        naightTemperature = t2
        println("Наличие осадков. Введите: ДА или НЕТ")
        var precipitation = readln()
        if (precipitation.contains("ДА", ignoreCase = true)) {
            presencePrecipitation = true
        }
        if (precipitation.contains("НЕТ", ignoreCase = true)) {
            presencePrecipitation = false
        }
        println("Дневная температура ${daytimeTemperature}С'")
        println("Ночная температура ${naightTemperature}С'")
        println("Наличие осадков  ${presencePrecipitation}")
    }
}

fun main() {
    var november7 = Weather3()
    november7.reportOfWeather()
}