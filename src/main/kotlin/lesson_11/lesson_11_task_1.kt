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
    println("ID пользователя:${user1.id} имя пользователя:${user1.name},пароль:${user1.password},email:${user1.mail}")
    println("ID пользователя:${user2.id} имя пользователя:${user2.name},пароль:${user2.password},email:${user2.mail}")

}