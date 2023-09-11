package Lesson_1

fun main() {
    val seconds: Int = 6480
    val hour: Int = seconds / 3600
    val minutes: Int = (seconds % 3600) / 60
    val second: Int = seconds % 60
    println("Время полета Гагарина Ю.А. в космосе составляло: ")
    print(String.format("%02d:%02d:%02d", hour, minutes, second))

}