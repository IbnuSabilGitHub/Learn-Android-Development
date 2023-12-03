package data

open class Exponent(val x:Int) {
   open val quadrat = x * x
}

class cubed(x:Int) : Exponent(x){
    override val quadrat = x * x * x
}

class pangkatEmpat(x:Int) : Exponent(x){
    override val quadrat = x * x * x * x
}