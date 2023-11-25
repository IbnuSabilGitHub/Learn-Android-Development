package Learn.Kotlin
tailrec fun factorial(n: Int, buffer: Int = 1):Int{
    return when(n){
        1 -> buffer
        else -> factorial(n - 1, n * buffer)
    }
}
fun Int.quad(n:Int):Int = this * this

fun main() {
    fun math(num: Int, transform: (Int) -> Int):Int = transform(num)


    println(math(2,{num:Int -> num.quad()}))

//    Trailling Lambda
    val result = math(2){num ->
        num.quad()
    }
    println(result)
    println(math(5,{num:Int -> factorial(num)}))
}

