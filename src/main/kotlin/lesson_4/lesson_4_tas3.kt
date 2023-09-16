package lesson_4

fun main() {
    val open: String = "открыто"
    val sun: String = "солнце"

    var weather: Boolean = sun == "солнце"
    var tentNow: Boolean = open == "открыто"
    var airHamidity: Int = 20
    var timeYearNow: String = "не зима"

    val result = (weather == true) && (tentNow == true) && (airHamidity == HAMIDITY) && (timeYearNow != WARM)
    println("Благоприятные ли условия сейчас для роста бобовых? Заключение: $result")

}
const val WARM = "зима"
const val HAMIDITY = 20