package lesson_13

class PhoneBook(
    val name:String,
    val phoneNumber:Long,
    val nameCompany:String?,
)

fun main(){
    val user1 = PhoneBook(
        name = "Виктор",
        phoneNumber = 89102294537,
        nameCompany = null
    )
    println(user1.name)
    println(user1.phoneNumber)
    println(user1.nameCompany)
}