package lesson_5

fun main() {
    println("Введите год рождения пользователя:")
    val userYearBorn = readLine()!!.toInt()

    val userAge = THIS_YEAR - userYearBorn

    if (userAge >= AGE_OF_MAJORITY){println("Показывать экран со скрытым контентом")}
    else {println("Показвать экран с ограниченным контентом")}
}

const val AGE_OF_MAJORITY = 18
const val THIS_YEAR = 2023
