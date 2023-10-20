package lesson_11

class CardRoomInterest(
    var cover: String,
    var nameRoom: String,
    var listOfParticipats: MutableList<AvatarUser>,
)

class AvatarUser(
    var name: String,
    var talking: Boolean,
    var microphoneMuted: Boolean,
    var userIsMuted: Boolean,
)

fun main() {
    longPressAvatar()
}


fun longPressAvatar() {

    var roomInterest: CardRoomInterest = CardRoomInterest(
        cover = "Drawing with a mug of beer",
        nameRoom = "Beer lovers club",
        listOfParticipats = mutableListOf(
            AvatarUser("Alex", true, false, false),
            AvatarUser("Tom", false, false, true),
            AvatarUser("Thomas", false, true, false)
        ),
    )

    println("ЛЕНТА")
    println("В ЭТОЙ ЛЕНТЕ СЛЕДУЮЩИЕ КОМНАТЫ ПО ИНТЕРЕСАМ:")
    println("ОБЛОЖКА КОМНАТЫ:${roomInterest.cover}, НАЗВАНИЕ КОМНАТЫ: ${roomInterest.nameRoom}")
    println("УЧАСТНИКИ КОМНАТЫ:${roomInterest.listOfParticipats[0].name},${roomInterest.listOfParticipats[1].name},${roomInterest.listOfParticipats[2].name}")

    println("Долгое нажатие на аватар (Введите имя АВАТАР-участника):")
    var listOfParticipatsSize = roomInterest.listOfParticipats.size
    var choiceAvatar = readln()
    for (i in 0..listOfParticipatsSize - 1)

        if (roomInterest.listOfParticipats[i].name.contains(choiceAvatar) == true) {

            if (choiceAvatar == roomInterest.listOfParticipats[i].name) {
                println("НИКНЕЙМ АВАТАРА:  ${roomInterest.listOfParticipats[i].name}")
                if (roomInterest.listOfParticipats[i].talking == true) {
                    println("БЕЙДЖ. СТАТУС: ${roomInterest.listOfParticipats[i].name} - разговаривает")
                }
                if (roomInterest.listOfParticipats[i].microphoneMuted == true) {
                    println("БЕЙДЖ. СТАТУС: ${roomInterest.listOfParticipats[i].name} - микрофон выключен")
                }
                if (roomInterest.listOfParticipats[i].userIsMuted == true) {
                    println("БЕЙДЖ. СТАТУС: ${roomInterest.listOfParticipats[i].name} - пользователь заглушен")
                }

            } else {
                println("Не достаточно долгое нажатие на Аватарке участника (Имя участника введено не корректно).")
            }
        }
}