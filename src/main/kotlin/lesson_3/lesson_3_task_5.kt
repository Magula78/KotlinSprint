package lesson_3

fun main() {
    val information = "D2-D4;0"

    var moveFrom = information.removeSuffix("-D4;0")
    println("Откуда ход: $moveFrom")

    var moveWhere = information.removeSurrounding("D2-",";0")
    println("Куда ход: $moveWhere")

    var numberMove  = information.removePrefix("D2-D4;")
    println("Номер хода: $numberMove")

}