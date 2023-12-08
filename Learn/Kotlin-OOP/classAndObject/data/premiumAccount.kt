package data

open class standardAccount(val nickname:String, val id:Int, val title:String, val bonusNewAccount:Int ){
    open val dailyBonus = 1;
    open val moonBlessing = false
    fun myAccount (){
        println("""Nickname: $nickname
        Id: $id
        Title: $title
        New Account Bonus: $bonusNewAccount
        dailyBonus: x$dailyBonus
        moonBlessing: $moonBlessing""".trimIndent())
    }

    constructor(nickname: String, id: Int, title: String) : this(nickname, id, title, 20){
        myAccount()
    }

    constructor(nickname: String, id: Int) : this(nickname, id, "standard", 20){
        myAccount()
    }


}

class premiumAccount(nickname: String, id: Int, title: String) : standardAccount(nickname, id, title, bonusNewAccount = 100){
    override val dailyBonus = 3
    override val moonBlessing = true
}

class epicAccount : standardAccount{
    constructor(nickname: String, id: Int, title: String) : super(nickname, id, title, 1000)
    override val dailyBonus = 10
    override  val moonBlessing = true

}


