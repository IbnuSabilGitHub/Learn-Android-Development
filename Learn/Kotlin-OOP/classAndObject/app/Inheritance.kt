package Learn.`Kotlin-OOP`.classAndObject.app

import data.*

fun main() {
    val mySelf = Employee("ibnu Sabil")
    mySelf.introduction("ibnu")

    val inMyAbsen = noAbsen11("Ibnu Sabil Al Zahari")
    inMyAbsen.introduction()

    val family = family("ibnu sabil")
    family.introduction("sabil")

    val jabatan = ketua("ibnu Sabil")
    jabatan.introduction("kaico")

    val wakil = wakil("ibnu shina")
    wakil.introduction()
}