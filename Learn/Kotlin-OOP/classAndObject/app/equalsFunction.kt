package Learn.`Kotlin-OOP`.classAndObject.app

import data.user

fun main() {

    val dataNickName= mutableListOf<user>()
    val userObj = user("kitsune","321")
    val userObj2 = user("spg Junior","423")
    val userObj3 = user("nullPlayers","321")

    dataNickName += userObj
    dataNickName += userObj2
    dataNickName += userObj3

    var validation = true
    // Input
    do {
        print("Masukan Nickname Anda: ")
        val userNickName = readln()
        print("Masukan Password Anda: ")
        val userPassword = readln()
        val userObjects = user(userNickName, userPassword) //To object
        //check apakah nickname sudah di gunakan
        when(userObjects){
            in dataNickName -> validation = true // jika ada, set value validation ke true
            !in dataNickName -> {
                dataNickName+= userObjects
                validation = false
            }
        }// jika tidak ada maka nickname ini akan di push ke array serta ser value validation ke false


    }while (validation)


    dataNickName.forEach { println(it.nickname) }

}