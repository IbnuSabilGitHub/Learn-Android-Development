package Learn.`Kotlin-OOP`.classAndObject.data

object Interest {
    val name = "Ibnuuuuu"
    val list = arrayOf("Games","anime","programing")

    fun listThisInterest():String{
        var buffer = """"""
       for (i in list){
           buffer += "-$i \n"
        }
        return buffer
    }

    fun printAll():String{
        return """
           |INTEREST
           |name : $name
           |interest:
           |${listThisInterest()}
        """.trimMargin()
    }

    fun Uppercase(value:String):String{
        return value.uppercase()
    }
    fun isHashCode(value:String):Int{
        return value.hashCode()
    }

}