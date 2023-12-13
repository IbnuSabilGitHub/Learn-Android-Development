package Learn.`Kotlin-OOP`.classAndObject.data

interface Interaction {
    val name:String
    val age:Int
    fun introduction()
}

interface mahlukhidup: Interaction {
    fun opening():Unit{
        println("perkenalakan")
    }
}

interface sampelA{
    fun printSampel() = println("this sanpel A")
}

interface sampelB{
    fun printSampel() = println("this sampel b")
}

interface sampelC{
    fun printSampel() = println("this sampel c")
}




class Human(override val name:String, override val age:Int): mahlukhidup{
    override fun introduction() {
        println("Dia adalah Human yang bernama $name dengan umur $age")
    }
}

class Animals(override val name:String, override val age:Int): mahlukhidup, sampelA, sampelB, sampelC{

    override fun printSampel() {
        super<sampelA>.printSampel()
        super<sampelB>.printSampel()
        super<sampelC>.printSampel()
    }
    override fun introduction() {
        println("Dia adalah Hewam yang di sebut $name dengan umur $age")
    }
}




