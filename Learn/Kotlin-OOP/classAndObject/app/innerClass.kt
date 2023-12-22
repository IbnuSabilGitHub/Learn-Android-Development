package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.profesi

fun main() {
    val pekerjaan = profesi("Programmer")
    val pekerjaan1 = profesi("UI/UX")

    println("Nama kariawati: ${pekerjaan.dataKobo().name}")
    pekerjaan.dataKobo().printAll()

    println("Nama kariawati: ${pekerjaan.dataBudi().name}")
    pekerjaan.dataBudi().printAll()


    println("Nama kariawati: ${pekerjaan1.dataKobo().name}")
    pekerjaan1.dataKobo().printAll()

}