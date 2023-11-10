fun main() {
    var count = 0

//    Function
    fun functionIncrement(): Unit {
        println("Function Increment")
        count ++
    }
//    Lambda Function
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        count ++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function")
        count ++
    }

    functionIncrement()
    functionIncrement()
    functionIncrement()

    lambdaIncrement()
    lambdaIncrement()
    lambdaIncrement()

    anonymousIncrement()
    anonymousIncrement()
    anonymousIncrement()

    println(count)
}