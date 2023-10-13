package lesson_11

class User(
    val id: Int,
    val name: String,
    val password: String,
    val mail: String,
)

fun main() {
    val user1: User = User(
        id = 1,
        name = "Вова",
        password = "tttt",
        mail = "Vova@mail.ru",

        )
    val user2: User = User(
        id = 2,
        name = "Вера",
        password = "vvvv",
        mail = "Vera@mail.ru",

        )
    println(user1.id)
    println(user1.name)
    println(user1.password)
    println(user1.mail)

    println(user2.id)
    println(user2.name)
    println(user2.password)
    println(user2.mail)
}