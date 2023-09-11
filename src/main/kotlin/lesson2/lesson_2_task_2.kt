package lesson2

fun main() {
    var essentialWorkers: Int = 50
    var trainee: Int = 30
    var totalEmployees: Int = essentialWorkers + trainee
    var salaryEssentialWorker: Int = 30000
    var salaryTrainee: Int = 20000
    var selaryEssWorkers: Int = salaryEssentialWorker * essentialWorkers
    var summSelaryTrainee: Int = salaryTrainee * trainee
    var salaryCosts: Int = selaryEssWorkers + summSelaryTrainee
    var averageSalaryEmployees: Int = salaryCosts / totalEmployees
    println("Всего работников на предприятии: $totalEmployees")
    println("Всего заработная плата постоянных сотрудников: $selaryEssWorkers рублей")
    println("Всего заработная плата стажеров: $summSelaryTrainee рублей")
    println("Всего затрат по зарабтной плате работников: $salaryCosts рублей")
    println("Средняя заработная плата работника: $averageSalaryEmployees рублей")

}