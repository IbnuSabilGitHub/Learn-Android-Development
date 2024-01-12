package Learn.`Kotlin-OOP`.classAndObject.app

data class validationException(val value:String):Throwable(value)


fun validationInput(nickname:String) {

    if (nickname.isBlank()){
        throw validationException("Erro!!, Input anda kosong")
    } else if( (nickname.length) > 15 ) {
        throw validationException("Anda melebihi batas input")
    }
    println(nickname)
}

fun main() {
    try {
        validationInput("Dodi")
        validationInput("Dodijefjsdufhksdfiusgedfkjsddsfsdfhsdfuh")
        validationInput("")
    } catch (error:validationException){
        println("erorr ${error.message}")
        println("erorr ${error.message}")
    } finally {
        println("Program berakhir")
    }
}