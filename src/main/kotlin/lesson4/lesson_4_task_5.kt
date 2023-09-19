package lesson4

fun main() {
    println("Имеется ли повреждения судна. введите:(имеются)(нет)(не значительные)")
    var demageShip: String = readln()
    println("Введите количество людей в экипаже на судне")
    var crewShip: Int = readLine()!!.toInt()
    println("Состояние погоды. Введите:(благоприятная) или (неблагоприятная)")
    var weather: String = readln()
    println("Введите количество ящиков провизии на корабле")
    var provitionShip: Int = readLine()!!.toInt()

    val conditionDemageShip1: Boolean = (demageShip == "нет")
    val conditionDemageShip2: Boolean = (demageShip == "не значительные")
    val conditionCrewShip: Boolean = (crewShip >= MIN_CREW) && (crewShip <= MAX_CREW)
    val conditionWeather1: Boolean = (weather == "благоприятная") || (weather == "неблагоприятная")
    val conditionWeather2: Boolean = (weather == "благоприятная")
    val conclusionProvision: Boolean = (provitionShip > PROVISION)

    val locked1: Boolean = (conditionDemageShip1) && (conditionCrewShip == true) &&
            (conditionWeather1 == true) && (conclusionProvision == true)
    val locked2: Boolean = ((conditionDemageShip1 == true) || (conditionDemageShip2 == true)) && (crewShip == MAX_CREW)
            && (conditionWeather2 == true) && (conclusionProvision)

    println("Готовность карабля к плаванию (готов - true)/(не готов - false): $locked1")
    println("Альтернатива готовности карабля к плаванию (готов - true)/(не готов - false): $locked2")
}

const val PROVISION = 50
const val MIN_CREW = 55
const val MAX_CREW = 70