

fun main() {
    fun factorialLoop(n: Int):Int{
        var buffer = 1
        for(i in n downTo 1){
                buffer *= i
        }
        return buffer
    }
    fun factorialRecursive(n: Int):Int{
        return when(n){
            1 -> 1
            else -> n * factorialRecursive(n -1)
        }
    }
    println(factorialLoop(5))
    println(factorialRecursive(5))
}