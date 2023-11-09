package lesson_12

class Weather(){
    var daytimeTemperature:Int = 15
            var naightTemperature:Int=2
    var presencePrecipitation:Boolean= false

    fun reportOfWeather(){
        println("Отчет по погоде:")
        println("Дневная температура ${daytimeTemperature}")
        println("Ночная температура ${naightTemperature}")
        println("Наличие осадков  ${presencePrecipitation}")
    }
}

fun main(){
    val november6 = Weather()
    november6.reportOfWeather()
    november6.daytimeTemperature=12
    november6.naightTemperature=0
    november6.presencePrecipitation=true
    november6.reportOfWeather()
    val november5 =Weather()
    november5.reportOfWeather()
    november5.daytimeTemperature=20
    november5.naightTemperature=4
    november5.presencePrecipitation=true
    november5.reportOfWeather()
}