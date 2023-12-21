package Learn.`Kotlin-OOP`.classAndObject.app

import Learn.`Kotlin-OOP`.classAndObject.data.*



fun operation(value1:Int,value2:Int, operation: OperationNum):Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Bagi -> value1 / value2
        is Modulo -> value1 % value2
        is Perbandingan -> if(value1 < value2) 1 else 0
        is Equals -> if(value1 == value2) 1 else 0
    }
}



 fun main() {

     println(operation(5,5,Plus()))
     println(operation(5,10,Minus()))
     println(operation(5,5,Bagi()))
     println(operation(5,3,Modulo()))
     println(operation(5,10,Perbandingan()))
     println(operation(5,5,Perbandingan()))
}