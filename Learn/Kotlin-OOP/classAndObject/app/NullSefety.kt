package Learn.`Kotlin-OOP`.classAndObject.app

import java.util.Objects

data class Friend(val name:String)
data class GirlFriend(val name:String)


fun sayHello(any: Any?){
    when (any){
        is Friend -> println("Hello, My Friend ${any.name}")
        is GirlFriend -> println("Hello, Girlfriend ${any.name}")
        null -> println("cari dulu sana goblog")
        else -> any.toString()
    }
}
// val name = friend?.name ?: "Apapun"
// setelah itu name akan di ganti dengan (Apapun)




fun main() {
    sayHello(Friend("udin"))
    sayHello(GirlFriend("Ei"))
    sayHello(null)
}