package Learn.`Kotlin-OOP`.classAndObject.app

import data.user

fun main() {

    val dataNickName= mutableListOf<user>()
    print("Masukan Nickname Anda: ")
    val userNickName = readln()
    print("Masukan Password Anda: ")
    val userPassword = readln()

    val userObj = user("kitsune","321")
    val userObj2 = user("spg Junior","423")
    val userObj3 = user("nullPlayers","321")
    val userObjects = user(userNickName, userPassword)
    dataNickName += userObj
    dataNickName += userObj2
    dataNickName += userObj3

    when(userObjects){
        in dataNickName -> readln()
        !in dataNickName -> dataNickName+= userObjects
    }

//    println("Array setelah ditambahkan objek:")
    dataNickName.forEach { println(it.nickname) }
    println(dataNickName[0] == userObjects)

}