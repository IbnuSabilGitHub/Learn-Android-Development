package Learn.`Kotlin-OOP`.classAndObject.data

interface Base{
    fun helloWorld2(value:String)
    fun helloDunia(value:String)
    fun helloSekai(value:String)
}

class MyBase:Base{
   override fun helloWorld2(value:String){
        println("Hellow World, $value")
    }
    override fun helloDunia(value:String){
        println("Hello Dunia, $value")
    }
    override fun helloSekai(value:String){
        println("Hello Sekai, $value")
    }
}

class Delegation(val base:Base) : Base by base