package lesson11

class User2(
    var id: Int,
    var name: String,
    var password: String,
    var mail: String,
    var bio: String,
)

fun main() {
    var user1: User2 = User2(
        id = 1,
        name = "Вова",
        password = "tttt",
        mail = "Vova@mail.ru",
        bio = ""
    )
    inputInformation(user1)
    forBio(user1)
    changePassword(user1)
    inputInformation(user1)

    var user3: User2 = User2(
        id = 3,
        name = "Yevgen",
        password = "aaaa",
        mail = "yebrend@mail.ru",
        bio = ""
    )
    println()
    inputInformation(user3)
    forBio(user3)
    changePassword(user3)
    inputInformation(user3)

}

fun inputInformation(user1: User2) {
    println()
    println("Информация о пользователе:")
    println("ID номер:  ${user1.id}")
    println("Имя пользователя:  ${user1.name}")
    println("Пароль:  ${user1.password}")
    println("Email:  ${user1.mail}")
    println("BIO information:  ${user1.bio}")
}

fun forBio(user1: User2) {

    user1.bio = "${user1.id},${user1.name},${user1.password},${user1.mail}"

    println(user1.bio)
}

fun changePassword(user1: User2) {
    println()
    println("Изменение пароля:")
    println("Введите текущий пароль")
    var oldPassword = readln()
    if (oldPassword == user1.password) {
        println("Старый пароль введен верно")
        println("Введите новый пароль")
        var newPassword = readln()
        user1.password = newPassword
        user1.bio = "ID номер:${user1.id}, имя:${user1.name}, парооль:${user1.password}, email adres:${user1.mail}"
        println("Пароль пользлователя ${user1.name} - изменен")

    } else {
        println("Старый Пароль введен не верно")
    }

}