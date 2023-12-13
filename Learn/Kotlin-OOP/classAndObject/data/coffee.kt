package data

class coffee{
    var coffeeName:String = ""
    var harga:Int = 0
    var rate:Int = 0
}

class beer{
    lateinit var name:String
    fun printBeer(name:String){
        this.name = name
        println("Ini adalah $name")
    }
}