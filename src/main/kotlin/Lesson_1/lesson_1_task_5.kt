package Lesson_1

fun main(){
    val seconds:Short = 6480
    val hour:Byte = 1
    val minutes:Byte = 48
    val second:Byte = 0
    val t:String =  String.format("%02d:%02d:%02d",hour,minutes,second)
    println(t)

}