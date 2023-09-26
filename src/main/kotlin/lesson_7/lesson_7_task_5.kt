package lesson_7

fun main() {
    println("Введите желаемый размер сгенирированного пороля. (введите целое число):")
    var sizePassword = readln().toInt()
    val range = 1..sizePassword
    var b = ""

    for (i in range) {
        var a = (('A'..'Z') + ('a'..'z') + ('1'..'9')).random().toString()
        b = "$b$a"

    }
    println(b)
}