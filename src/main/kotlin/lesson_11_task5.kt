package lesson_11

import kotlin.random.Random

class Net(
    val nameNet: String,
    val specificityNet: String,
    var listUserNet: MutableMap<Int, String>,
) {
    fun createUserId(): Int {
        val userId = Random.nextInt(1, 1000).toInt()
        return userId
    }

    fun createUserName(authorId: String, userId: Int): String {
        var changeTip = userId.toString()
        var nameId = authorId + changeTip
        return nameId
    }

    fun addListUserNet(userId: Int, userName: String, listUserNet: MutableMap<Int, String>): MutableMap<Int, String> {
        listUserNet.put(userId, userName)
        return listUserNet
    }
}

class UserNet(
    var userId: Int,
    var userName: String = "",
    var datamessages: MutableMap<String, String>,
    var listMessagesUser: MutableList<String> = mutableListOf(),
)

class MessageNet(
    var authorId: String,
    var message: String = "",
) {
    fun createNewMessage(listUserNet: MutableMap<Int, String>, userId: Int): String {
        if (listUserNet.containsKey(userId) == true) {
            message = readln()

            return message
        } else {
            message = ""
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

fun main() {
    val fabricNet = Net(
        nameNet = "FORUM",
        specificityNet = "Деловая связь между специалистами фабрики",
        listUserNet = mutableMapOf(),
    )
    var bob = MessageNet("Bob")
    var user1 = UserNet(0, "", mutableMapOf())

    var piter = MessageNet("Piter")
    var user2 = UserNet(0, "", mutableMapOf())

    println(fabricNet.nameNet)
    println(fabricNet.specificityNet)

    println("Здравствуйье ${bob.authorId}! вы находитесь в чате ${fabricNet.nameNet} карпоративной сети фабрики.")
    println("${fabricNet.nameNet} сгенирирует ваш индивидуальный id номер и прибавит к имени ${bob.authorId}.")
    println("При каждом новом входе в чат ${fabricNet.nameNet} id номер будет сгенирирован новый.")
    println("Если вы хотите присоеденится ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
    var keyNet = readln().toInt()
    var idUser = fabricNet.createUserId()
    var nameUser = fabricNet.createUserName(bob.authorId, idUser)
    while (keyNet == 1) {

        println("${nameUser}, Добро пожаловать в ${fabricNet.nameNet}")
        var inListUsers = fabricNet.addListUserNet(idUser, nameUser, linkedMapOf())
        println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ. (После ответа Да вводите сообщение)")
        var key2 = readln()
        while (key2.contains("ДА", ignoreCase = true)) {

            bob.createNewMessage(inListUsers, idUser)
            var currentMessageUser = bob.addHistoryMessage(nameUser, bob.message, user1.datamessages)
            var historyMessageUser = bob.addHistoryListMessage(bob.message, user1.listMessagesUser)
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
    var nameUser2 = fabricNet.createUserName(piter.authorId, idUser)
    while (keyNet2 == 1) {

        println("${nameUser2}, Добро пожаловать в ${fabricNet.nameNet}")
        var inListUsers = fabricNet.addListUserNet(idUser, nameUser2, linkedMapOf())
        println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ")
        var key2 = readln()
        while (key2.contains("ДА", ignoreCase = true)) {

            piter.createNewMessage(inListUsers, idUser)
            var currentMessageUser = piter.addHistoryMessage(nameUser2, piter.message, user2.datamessages)
            var historyMessageUser = piter.addHistoryListMessage(piter.message, user2.listMessagesUser)
            println("Текущее сообщение $nameUser2: $currentMessageUser")
            println("История сообщений $nameUser2: $historyMessageUser")
            println("Вы хотите написать сообщение в ${fabricNet.nameNet}? Напишите ДА или НЕТ")
            key2 = readln()
        }

        println("Чтобы продолжить общение в ${fabricNet.nameNet} нажмите: 1, если хотите выйти из сети ${fabricNet.nameNet} нажмите: 2")
        keyNet2 = readln().toInt()

    }
}

