package lesson_9

fun main() {

    println("Введите пять ингредиентов.Следуйте запросу")

    val resept = arrayListOf<String>()

    for (i in 0..1000) {
        val inputFood = readLine().toString()

        if ((resept.contains(inputFood) == false)) {
            resept.add(inputFood)

            println(resept)
        } else {
            println("Игредиент есть в списке. Введите заново:")
            resept.minus(inputFood)
            println(resept)
        }
        if (resept.size == 5) {
            println("Вы ввели все игредиенты")
            // Дальше не могу дать ладу с певой заглавной :-(

            println(resept.joinToString(transform = String::capitalize, separator = ",", postfix = "."))
            break
        }


    }
}
