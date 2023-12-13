package Learn.`Kotlin-OOP`.classAndObject.app

import data.beer

fun main() {
    var initBeer = beer()
    initBeer.name = "The Init"
    println(initBeer.name)
    initBeer.printBeer("The Class")
    println(initBeer.name)
}