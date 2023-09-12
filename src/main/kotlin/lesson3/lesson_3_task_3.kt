package lesson3

fun main() {
    var number: Int = 6

    val table = """
   |6 x 1 = ${number * 1}
   |6 x 2 = ${number * 2}
   |6 x 3 = ${number * 3}
   |6 x 4 = ${number * 4}
   |6 x 5 = ${number * 5}
   |6 x 6 = ${number * 6}
   |6 x 7 = ${number * 7}
   |6 x 8 = ${number * 8}
   |6 x 9 = ${number * 9}
   |6 x 10 = ${number * 10}
   """.trimMargin()

    println(table)
}