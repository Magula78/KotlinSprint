package lesson11

class User2(
    val id: Int,
    val name: String,
    var password: String,
    val mail: String,
    var bio: String = "",
)

fun main() {
    val user1: User2 = User2(
        id = 1,
        name = "Вова",
        password = "tttt",
        mail = "Vova@mail.ru",

        )
    displayInformation(user1)
    collectionInformationBio(user1)
    changePassword(user1)
    displayInformation(user1)

    val user3: User2 = User2(
        id = 3,
        name = "Yevgen",
        password = "aaaa",
        mail = "yebrend@mail.ru",

        )
    println()
    displayInformation(user3)
    collectionInformationBio(user3)
    changePassword(user3)
    displayInformation(user3)

}

fun displayInformation(user1: User2) {
    println()
    println("Информация о пользователе:")
    println("ID номер:${user1.id},имя:${user1.name}, пароль:${user1.password},email:${user1.mail}")
}

fun collectionInformationBio(user1: User2) {

    user1.bio = "${user1.id},${user1.name},${user1.password},${user1.mail}"
    println(user1.bio)
}

fun changePassword(user1: User2) {
    println()
    println("Изменение пароля:")
    println("Введите текущий пароль")
    val oldPassword = readln()
    if (oldPassword == user1.password) {
        println("Старый пароль введен верно")
        println("Введите новый пароль")
        val newPassword = readln()
        user1.password = newPassword
        user1.bio = "ID номер:${user1.id}, имя:${user1.name}, парооль:${user1.password}, email adres:${user1.mail}"
        println("Пароль пользлователя ${user1.name} - изменен")

    } else {
        println("Старый Пароль введен не верно")
    }

}