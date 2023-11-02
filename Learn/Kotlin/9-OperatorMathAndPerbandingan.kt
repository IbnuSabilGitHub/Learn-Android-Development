fun main() {

    var countOrder = 5
    val price = 25
    var countPrice = 0
//+,-,*,/,%
    var index = 0
    for(i in 1..countOrder){
        countPrice += price
        index++;
    }
    var hasil: Double = 0.0
    val discount: Double = 0.30
    val buyTwoFreeOne = 2
    var strDiscount = "Di Discount"
    if(countOrder > buyTwoFreeOne){ // boolean
        hasil = countPrice.toDouble() - (price * countOrder  * discount)
    }else{
        hasil = countPrice.toDouble()
        strDiscount = "Tidak di Discount"

    }


    val output: String = """
        TERIMAKASIH TELAH MEMBELI
        Total pesanan : $countOrder
        Total harga : $hasil ($strDiscount)
    """.trimIndent()

    println(output)
}