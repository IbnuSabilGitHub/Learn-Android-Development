package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.MathConstan
import Learn.`Kotlin-OOP`.classAndObject.data.nickname
import kotlin.math.floor

fun main() {
    val MathPi = nickname.spgJunior
    val allValueArr: Array<nickname> = nickname.values()
    println(nickname.valueOf("spgJunior"))
    println(allValueArr.toList())

    val pi = MathConstan.pi.value
    val e = MathConstan.e.value
    val allDataMath : Array<MathConstan> = MathConstan.values()
    println("Nilai konstan dari pi yaitu : $pi atau ${floor(pi)}")
    println("Nilai konstan dari e yaitu : $e atau ${floor(e)}")
    allDataMath.forEach { data -> println(data.value) }

}