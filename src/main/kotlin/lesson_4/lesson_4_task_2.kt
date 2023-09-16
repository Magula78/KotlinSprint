package lesson_4

fun main() {
    val cargo1 = 20
    val volume1 = 80
    println("Груз с весом $cargo1 и обьемом $volume1 соответсвует категории Avarage: ${(cargo1 >= MIN_MASS) && 
            (cargo1 <= MAX_MASS) && (volume1 < VOLUM)}")

    val cargo2 = 50
    val volume2 = 100
    println("Груз с весом $cargo2 и обьемом $volume2 соответсвует категории Avarage: ${(cargo2 >= MIN_MASS) && 
            (cargo2 <= MAX_MASS) && (volume2 < VOLUM)}")}

const val MAX_MASS = 100
const val MIN_MASS = 35
const val VOLUM = 100



