

fun quadrat(x:Int):Int{
   val quad = x * x
    return quad
}
//Single Expression Function
fun quadratSingle(x:Int):Int = x * x
fun main() {
    val result = quadrat(5)
    val resultSingle = quadratSingle(10)
    println(result)
    println(resultSingle)
}