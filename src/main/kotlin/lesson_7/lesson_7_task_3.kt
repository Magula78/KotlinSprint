package lesson_7

fun main() {
    println("Введите любое число:")
    var number1 = readLine()?.toInt() ?: 0

    for (i in 0..number1) {
        if (i % 2 == 0)
            print(i)
    }

}