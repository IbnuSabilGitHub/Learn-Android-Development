fun main() {
    tailrec fun tailRecurisve(n: Int){
        println(n)
        if(n > 0){
            tailRecurisve(n - 1)
        }
    }

    tailrec fun factorial(n: Int, buffer: Int = 1):Int{
        return when(n){
            1 -> buffer
            else -> factorial(n - 1, n * buffer)
        }
    }
//    tailRecurisve(100)
    println(factorial(5))
}