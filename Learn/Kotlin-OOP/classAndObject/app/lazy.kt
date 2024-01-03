package Learn.`Kotlin-OOP`.classAndObject.app
class malas {
    val siLazy:Array<String> by lazy {
        println("SI PEMALAS")
        arrayOf("udin","jamal","dodi","adit")
    }
}

fun main() {
    val yangMalas = malas()
    println(yangMalas.siLazy.toList())
}