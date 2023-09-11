package lesson_2

fun main(){

    var hourDeparture: Int = 9
    var minuteDeparture: Int = 39
    val travelTimeTrain: Int = 457
    var timeArrivalTrain: Int = hourDeparture * 60 + minuteDeparture + travelTimeTrain
    val hour: Int = timeArrivalTrain / 60
    val minutes: Int = (timeArrivalTrain % 60)
    println("Время прибытия поезда составит: ")
    print(String.format("%02d:%02d", hour, minutes))

}