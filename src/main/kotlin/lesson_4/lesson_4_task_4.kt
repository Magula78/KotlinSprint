package lesson_4

fun main() {
    var dey = 6   // здесь введите номер дня вашей тренировки
    val exercise1 = "Упражнения для рук"
    val exercise2 = "Упражнения для ног"
    val exercise3 = "Упражнения для спины"
    val exercise4 = "Упражнения для пресса"

    val prog1: Boolean = (dey == DAY_1) || (dey == DAY_3) || (dey == DAY_5) || (dey == DAY_7)
    val prog2: Boolean = (dey == DAY_2) || (dey == DAY_4) || (dey == DAY_6)

    val recomendation = """
 $exercise1: $prog1
 $exercise2: $prog2
 $exercise3: $prog2
 $exercise4: $prog1
""".trimIndent()

    println(recomendation)

}

const val DAY_1 = 1
const val DAY_2 = 2
const val DAY_3 = 3
const val DAY_4 = 4
const val DAY_5 = 5
const val DAY_6 = 6
const val DAY_7 = 7