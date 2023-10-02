package lesson_9

fun main() {
    val omletDich = mutableListOf(2, 50, 15)

    println("Введите необходимое количество порций ОМЛЕТА:")

    var portionQantity = readln().toInt()
    var order = omletDich.map { it * portionQantity }

    println(omletDich)
    println(order)
    println("На количество порций ОМЛЕТА ($portionQantity порции) Вам понадобится : Яиц - ${order[0]} шт., молока - ${order[1]} мл, сливочного масла - ${order[2]} грамм. ")

}