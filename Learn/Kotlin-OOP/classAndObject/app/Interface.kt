package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.Animals
import Learn.`Kotlin-OOP`.classAndObject.data.Human

fun main() {
    val Manusia = Human("Ibnu", 17)
    val Hewan = Animals("Kucing", 7)

    Manusia.opening()
    Manusia.introduction()
    Hewan.introduction()
    Hewan.printSampel()


}