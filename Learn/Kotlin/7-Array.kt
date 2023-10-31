fun main() {
    val nameMenu: Array<String> = arrayOf("Coffee","White Coffee", "Black Coffee", "Chocolate Coffee")
    nameMenu.set(3, "Chocolate Cappuccino")
    val price: Array<Long> = arrayOf(10_0000, 16_000, 15_0000, 20_0000 )
    price[3] = 25_000

    val menu = """
        Terdapat ${nameMenu.size} menu
        1.${nameMenu.get(0)} = ${price[0]}
        2.${nameMenu[1]} = ${price[1]}
        3.${nameMenu[2]} = ${price[2]}
        4.${nameMenu[3]} = ${price[3]}
    """.trimIndent()

    println(menu)

    val NULLABEL: Array<String?> = arrayOfNulls(3)
    NULLABEL[0] = "Terimakasih "
    NULLABEL[1] = "Telah "
    NULLABEL[2] = "Membeli"
    for(NULLABEL in NULLABEL){
        print(NULLABEL)
    }
}