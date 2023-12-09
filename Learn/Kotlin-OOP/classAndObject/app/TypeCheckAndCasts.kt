import Learn.`Kotlin-OOP`.classAndObject.data.*


fun prosesor(any: Any){
    when (any) {
        is cpu -> any.run { printSpecifications() }
        is gpu -> any.run { printSpecifications() }
        else -> any.toString()
    }
}

fun main() {
    prosesor(cpu("Ryzen Prosesor", "5000 SERIES"))
    prosesor(gpu("Nvidia Genforce RTX", "RTX 3050"))
}