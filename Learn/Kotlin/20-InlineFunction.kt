package Learn.Kotlin

inline fun math(num: Int, oprations: (Int) -> Int):Int = oprations(num)
inline fun char(value: String, oprations: (String) -> String):String = oprations(value)

fun main() {
    fun Int.quad():Int = this * this
    fun String.fungsi():Unit = println("Hello ${this}")


    val result = math(5){num:Int ->
        num.quad()
    }

    val resultString = char("kotline"){num:String ->
        num.uppercase()
    }

    println(result)
}