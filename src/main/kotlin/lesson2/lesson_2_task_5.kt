package lesson2



fun main() {
    val sumContribution = 70000
    val percent = 16.7
    val termContribution = 20

    val profit = String.format("%.3f", ((sumContribution * percent * termContribution) / 100) + sumContribution)
    println(profit)
}