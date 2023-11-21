package com.company.learn.until.Math


fun mathOperation(num:Int, operation: (Int) -> Int):Int = operation(num)
fun mathOperationStr(num:Int, operation: (Int) -> String):String = operation(num)

fun Int.quad():Int = this * this
val quadrat = fun (num:Int):Int = num.quad()

tailrec fun factorial(n:Int, buffer:Int = 1):Int{
    return when (n){
        1 -> buffer
        else -> factorial(n-1, n * buffer)
    }
}
val factorial = fun(num:Int):Int = factorial(num)

fun Int.thisIsEven():String {
    return when{
        this % 2 == 0 -> "This Is Even"
        else -> "This Is not Even"
    }
}
val even = fun(num:Int):String = num.thisIsEven()


