package lesson_11

class CardRoomInterest(
    var cover: String,
    var nameRoom: String,
    var participants: MutableList<AvatarUser>
) {
    fun coverIt(participants: MutableList<AvatarUser>): MutableList<AvatarUser> {
        println("ЛЕНТА")
        println("В ЭТОЙ ЛЕНТЕ СЛЕДУЮЩИЕ КОМНАТЫ ПО ИНТЕРЕСАМ:")
        println("ОБЛОЖКА КОМНАТЫ:${cover}")
        println("НАЗВАНИЕ КОМНАТЫ: ${nameRoom}")
        for (i in 0..participants.size - 1) {
            println("${i + 1}-й УЧАСТНИК КОМНАТЫ ''${nameRoom}'':${participants[i].name}")
        }
        return participants
    }
}

class AvatarUser(
    var name: String = "",
    var talking: Boolean = false,
    var microphoneMuted: Boolean = false,
    var userIsMuted: Boolean = false,
) {

    fun longPressAvatar(participants: MutableList<AvatarUser>) {

        println("Долгое нажатие на аватар:")
        println("Выбери имя участника комнаты.Введите имя")

        var choiceAvatar = readln()
        for (i in 0..participants.size - 1)

            if (participants[i].name.contains(choiceAvatar) == true) {

                if (choiceAvatar == participants[i].name) {
                    println("НИКНЕЙМ АВАТАРА:  ${participants[i].name}")
                    when {
                        (participants[i].talking == true) -> println("БЕЙДЖ. СТАТУС: ${participants[i].name} - разговаривает")
                        (participants[i].microphoneMuted == true) -> println("БЕЙДЖ. СТАТУС: ${participants[i].name} - микрофон выключен")
                        (participants[i].userIsMuted == true) -> println("БЕЙДЖ. СТАТУС: ${participants[i].name} - пользователь заглушен")
                    }

                } else {
                    println("Не достаточно долгое нажатие на Аватарке участника (Имя участника введено не корректно).")
                }
            }
    }
}

fun main() {

    var listParticipantsВeer = mutableListOf<AvatarUser>(
        AvatarUser("Tod", true, false, false),
        AvatarUser("Bob", false, true, false),
        AvatarUser("Pit", false, false, true),
    )
    var roomInterestBeer = CardRoomInterest(
        cover = "На обложке изображен стакан с пивом",
        nameRoom = "Пивнушка",
        participants = listParticipantsВeer
    )

    roomInterestBeer.coverIt(listParticipantsВeer)

    for (i in 0..roomInterestBeer.participants.size - 1) {
        roomInterestBeer.participants[i].longPressAvatar(listParticipantsВeer)
    }

    var listParticipantsHoney = mutableListOf<AvatarUser>(
        AvatarUser("Ivan", true, false, false),
        AvatarUser("Alex", false, true, false),
        AvatarUser("Duke", false, false, true),
        AvatarUser("Jone", false, false, true),
    )

    var roomInterestHoney = CardRoomInterest(
        cover = "На обложке изображена бочка с медом",
        nameRoom = "Пасечник",
        participants = listParticipantsHoney
    )

    roomInterestHoney.coverIt(listParticipantsHoney)

    for (i in 0..roomInterestHoney.participants.size - 1) {
        roomInterestHoney.participants[i].longPressAvatar(listParticipantsHoney)
    }
}






