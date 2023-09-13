package lesson_3

fun main (){
    var moveFrom:String = "E2"
    var moveWhere:String = "E4"
    var numberMove = 1

    println("Игрок совершил ход № $numberMove c $moveFrom на $moveWhere")

    moveFrom = "D2"
    moveWhere= "D3"
    numberMove = 2

    println("Игрок совершил ход № $numberMove c $moveFrom на $moveWhere")
}