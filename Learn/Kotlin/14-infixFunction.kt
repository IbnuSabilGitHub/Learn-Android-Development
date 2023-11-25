package Learn.Kotlin
infix fun Int.akar(n: Int):Int{
    var buffer = 1
    for (i in 1..n){
        buffer *= this
    }
    return buffer
}


fun main() {
    val num = 2
    println(num akar 2)
    println(num akar 3)
    println(num akar 4)
}