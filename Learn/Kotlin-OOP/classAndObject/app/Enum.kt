package Learn.`Kotlin-OOP`.classAndObject.app

import kotlin.math.floor
enum class nicknameMath {
    spgJunior,QWERTYUIO
}

enum class MathConstan(val value:Double){
    pi(3.14159265359),
    e(2.71828182846);
}

fun main() {
    val MathPi = nicknameMath.spgJunior
    val allValueArr: Array<nicknameMath> = nicknameMath.values()
    println(nicknameMath.valueOf("spgJunior"))
    println(allValueArr.toList())

    val pi = MathConstan.pi.value
    val e = MathConstan.e.value
    val allDataMath : Array<MathConstan> = MathConstan.values()
    println("Nilai konstan dari pi yaitu : $pi atau ${floor(pi)}")
    println("Nilai konstan dari e yaitu : $e atau ${floor(e)}")
    allDataMath.forEach { data -> println(data.value) }

}