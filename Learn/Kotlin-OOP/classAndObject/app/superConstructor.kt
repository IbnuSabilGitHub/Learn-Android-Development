package Learn.`Kotlin-OOP`.classAndObject.app

import data. *
fun main() {
    print("Nickname: ")
    val userNickName = readln()
    print("Code Title: ")
    val reedmCode:String? = readln()
    val titleUser = checkReedm(reedmCode)
    println(titleUser)
    if(titleUser == "Standard"){
        val standard = standardAccount(userNickName, 2342 ,titleUser)
    }else if(titleUser == "Premium"){
        val premium = premiumAccount(userNickName, 2342,titleUser)
        premium.myAccount()

    }else if(titleUser == "Epic"){
        val epic = epicAccount(userNickName, 2342, titleUser)
        epic.myAccount()
    }
}

fun checkReedm(code:String?):String{
    return when{
        code == null -> "Standard"
        code == "premiumACC123" -> "Premium"
        code == "epicACC!@#$%" -> "Epic"
        else -> "Unknown"
    }
}