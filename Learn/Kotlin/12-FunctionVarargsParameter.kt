
fun countArray(array:Array<Int>):Int{
    var buffer = 0
    for(i in array){
        buffer += i
    }
    return  buffer
}

fun countVarargs(vararg array:Int):Int{
    var buffer = 0
    for(i in array){
        buffer += i
    }
    return  buffer
}
fun main() {
    val num = arrayOf(5,5,5)
    val result = countArray(num)
    val resultVarargs = countVarargs(5,5,5)
    println(result)
    println(resultVarargs)


}