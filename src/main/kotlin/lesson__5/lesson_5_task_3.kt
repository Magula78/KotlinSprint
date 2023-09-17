package lesson__5

fun main() {
    println("Лоторея")
    println("Введите по запросу два любых числа в диапозоне от 1 до 100")

    println("Введите первое число")
    val attempt1 = readLine()!!.toInt()
    if ((attempt1 != ANSVER_1) && (attempt1 != ANSVER_2)) {println("Вы не угадали первое число")
    } else if (attempt1 == ANSVER_1 || attempt1 == ANSVER_2) {"Поздравляю вы угадали первое число" }

    val corect1 = ANSVER_1 - attempt1
    val corect2 = ANSVER_2 - attempt1

    println("Введите второе число")
    val attempt2 = readLine()!!.toInt()
    if ((attempt2 != ANSVER_1) && (attempt2 != ANSVER_2)) {println("Вы не угадали второе число") }
    else if (attempt2 == ANSVER_1 || attempt2 == ANSVER_2) {"Поздравляю вы угадали второе число" }

    val corect3 = ANSVER_1 - attempt2
    val corect4 = ANSVER_2 - attempt2

    if ((corect1 == 0 || corect2 == 0) && (corect3 == 0 || corect4 == 0)) { println("Поздравляю вы выйграли главный приз!")
    } else if (corect1 != 0 && corect2 != 0 && corect3 != 0 && corect4 != 0) {println("неудача!")
    } else {println("Утешительный приз!")}

}

const val ANSVER_1 = 3
const val ANSVER_2 = 34