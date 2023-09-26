package lesson_7

fun main() {
    println("Введите любое число:")
    var number1 = readln().toInt()
    var progression = 0..number1 step 2

    for (i in progression) {
        print(i)
    }

}