package Learn.`Kotlin-OOP`.classAndObject.app
import kotlin.properties.Delegates
class malas(nickname:String = "") {
    val siLazy:Array<String> by lazy {
        println("SI PEMALAS")
        arrayOf("udin","jamal","dodi","adit")
    }

    var dataPemalas:String by Delegates.observable(nickname) {
        property, oldValue, newValue ->
        println("${property.name} di ubah $oldValue ke $newValue")
    }
}

fun main() {
    val yangMalas = malas()
    println(yangMalas.siLazy.toList())

    val meLazy = malas()
    yangMalas.dataPemalas = "ibnuuu"
    yangMalas.dataPemalas = "kepin"
    yangMalas.dataPemalas = "adit"

}