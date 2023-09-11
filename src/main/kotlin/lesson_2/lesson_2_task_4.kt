package lesson_2

fun main() {
    val buff = 20
    val cristalOre = 7
    val feOre = 11
    var cristalOreBuff: Int = (cristalOre * buff) / 100
    var feOreBuff: Int = (feOre * buff) / 100
    println("Бафф по кристалтческой руде составил: $cristalOreBuff")
    println("Бафф по железной руде составил: $feOreBuff")
}