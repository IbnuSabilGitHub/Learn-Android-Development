package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.city
import Learn.`Kotlin-OOP`.classAndObject.data.streetAddress

fun main() {
    val kota = city("Tokyo")
    val jalan = streetAddress("ikuyo")

    kota.printInfoPublic()
//    kota,printInfoPrivate()  karena fungsi ini hanya bisa diakses di tempat deklarasinya
//    kota.printInfoProtected() Karena fungsi ini hanya bisa diakses di tempat deklarasi, dan juga turunannya
    kota.printInfoInternal()
    jalan.printInfoInternal() // melalui internal (hanya bisa diakses di module?project yang sama) yang di deklarasikan di class city akan mengambil value dari turunan fungsi printInfoProtected()
}