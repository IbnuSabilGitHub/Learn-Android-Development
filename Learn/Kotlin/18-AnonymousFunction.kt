fun main() {
    fun Int.quad(num:Int):Int = this * this
    tailrec fun factorial(n:Int, buffer:Int = 1):Int{
        return when(n){
            1 -> buffer
            else -> factorial(n-1, n * buffer)
        }
    }
//    High Order Lambda Function
    fun mathOpration(num:Int,transfrom:(Int) -> Int):Int = transfrom(num)
    fun characterOpration(char: String,transfrom:(String) -> String):String = transfrom(char)

    val up = fun(value:String):String{
        if(value == null){
            return "Null. Non have value"
        }
        return value.uppercase()
    }

    println(mathOpration(5, {num:Int -> factorial(num)}))
    println(characterOpration("ibnu", up))
}

