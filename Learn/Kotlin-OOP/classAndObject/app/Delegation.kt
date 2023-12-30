package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.Base
import Learn.`Kotlin-OOP`.classAndObject.data.Delegation
import Learn.`Kotlin-OOP`.classAndObject.data.MyBase

fun main() {
    val base = MyBase()
    val hello = Delegation(base)

    hello.helloDunia("BUDi")
    hello.helloSekai("Setsuna")
    hello.helloWorld2("Frankiln")


}
