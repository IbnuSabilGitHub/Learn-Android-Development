package Learn.`Kotlin-OOP`.classAndObject.app
import data.user

fun main() {
    var userData = user("Raiden Shogun", "Muso no Hitotachi")

    val output = """
        Nickname : ${userData.nickname}
        Password = ${userData.password}
    """.trimIndent()

    println(output)
}