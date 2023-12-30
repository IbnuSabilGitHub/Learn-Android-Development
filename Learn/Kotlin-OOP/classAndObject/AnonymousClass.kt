package Learn.`Kotlin-OOP`.classAndObject

import Learn.`Kotlin-OOP`.classAndObject.data.HellowWord

fun printThis(helloword:HellowWord){
    helloword.helloWord()
}

class sampelHellowWord : HellowWord {
    override fun helloWord() {
        println("Hello, Word")
    }
}
fun main() {
    printThis(sampelHellowWord())
    printThis(object : HellowWord {
        override fun helloWord() = println("Hello, word anonymous one")

    })

    printThis(object : HellowWord {
        override fun helloWord() = println("Hello, word anonymous two")
    })

    printThis(object : HellowWord {
        override fun helloWord() = println("Hello, word anonymous three")
    })
}