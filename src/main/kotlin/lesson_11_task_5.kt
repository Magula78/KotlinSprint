package lesson_11

import kotlin.random.Random

class Net(
    val nameNet: String,
    val specificityNet: String,
) {
    var listUserNet = mutableMapOf<Int, String>()

    fun createUserId(): Int {
        val userId = Random.nextInt(1, 1000).toInt()
        return userId
    }

    fun addListUserNet(userId: Int, userName: String, listUserNet: MutableMap<Int, String>): MutableMap<Int, String> {
        listUserNet.put(userId, userName)
        return listUserNet
    }

    fun createNewMessage(listUserNet: MutableMap<Int, String>, userId: Int, message: String): String {
        if (listUserNet.containsKey(userId) == true) {
            var message = readln()
            println("сообщение в ветке: ${message}")
            return message
        } else {
            return message
        }
    }

    fun addHistoryListMessage(message: String, listMessagesUser: MutableList<String>): MutableList<String> {
        listMessagesUser.add(message)
        return listMessagesUser
    }

    fun addHistoryMessage(
        nameId: String,
        message: String,
        datamessages: MutableMap<String, String>
    ): MutableMap<String, String> {
        datamessages.put(nameId, message)
        return datamessages
    }
}

class UserNet(
    val userId: Int,
    val userName: String = "",
    var datamessages: MutableMap<String, String>,
    var listMessagesUser: MutableList<String> = mutableListOf(),
)

class MessageNet(
    val authorId: String,
    var message: String = "",
)

fun main() {
    val fabricNet = Net(
        nameNet = "FORUM",
        specificityNet = "Деловая связь между специалистами фабрики",

        )
    val bob = MessageNet("Bob")
    val user1 = UserNet(0, "", mutableMapOf())

    val piter = MessageNet("Piter")
    val user2 = UserNet(0, "", mutableMapOf())

    println(fabricNet.nameNet)
    println(fabricNet.specificityNet)

    println("Здравствуйье ${bob.authorId}! вы находитесь в чате ${fabricNet.nameNet} карпоративной сети фабрики.")
    println("${fabricNet.nameNet} сгенирирует ваш индивидуальный id номер и прибавит к имени ${bob.authorId}.")
    println("При каждом новом входе в чат ${fabricNet.nameNet} id номер будет сгенирирован новый.")
    println("Если вы хотите присоеденится ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
    var keyNet = readln().toInt()
    var idUser = fabricNet.createUserId()
    val nameUser = createUserName(bob.authorId, idUser)
    while (keyNet == 1) {

        println("${nameUser}, Добро пожаловать в ${fabricNet.nameNet}")
        val inListUsers = fabricNet.addListUserNet(idUser, nameUser, linkedMapOf())
        println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ. (После ответа Да вводите сообщение)")
        var key2 = readln()
        while (key2.contains("ДА", ignoreCase = true)) {

            var messageNew = fabricNet.createNewMessage(inListUsers, idUser, bob.message)
            var currentMessageUser = fabricNet.addHistoryMessage(nameUser, messageNew, user1.datamessages)
            var historyMessageUser = fabricNet.addHistoryListMessage(messageNew, user1.listMessagesUser)

            println("Текущее сообщение $nameUser: $currentMessageUser")
            println("История сообщений $nameUser: $historyMessageUser")
            println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ")
            key2 = readln()
        }

        println("Чтобы продолжить общение в ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
        keyNet = readln().toInt()

    }
    println("Здравствуйье ${piter.authorId}! вы находитесь в чате ${fabricNet.nameNet} карпоративной сети фабрики.")
    println("${fabricNet.nameNet} сгенирирует ваш индивидуальный id номер и прибавит к имени ${piter.authorId}.")
    println("При каждом новом входе в чат ${fabricNet.nameNet} id номер будет сгенирирован новый.")
    println("Если вы хотите присоеденится ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
    var keyNet2 = readln().toInt()
    idUser = fabricNet.createUserId()
    var nameUser2 = createUserName(piter.authorId, idUser)
    while (keyNet2 == 1) {

        println("${nameUser2}, Добро пожаловать в ${fabricNet.nameNet}")
        var inListUsers = fabricNet.addListUserNet(idUser, nameUser2, linkedMapOf())
        println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ")
        var key2 = readln()
        while (key2.contains("ДА", ignoreCase = true)) {

            var messageNew = fabricNet.createNewMessage(inListUsers, idUser, piter.message)
            var currentMessageUser = fabricNet.addHistoryMessage(nameUser2, messageNew, user2.datamessages)
            var historyMessageUser = fabricNet.addHistoryListMessage(messageNew, user2.listMessagesUser)
            println("Текущее сообщение $nameUser2: $currentMessageUser")
            println("История сообщений $nameUser2: $historyMessageUser")
            println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ")
            key2 = readln()
        }

        println("Чтобы продолжить общение в ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
        keyNet2 = readln().toInt()

    }
}

fun createUserName(authorId: String, userId: Int): String {
    val changeTip = userId.toString()
    val nameId = authorId + changeTip
    return nameId
}


