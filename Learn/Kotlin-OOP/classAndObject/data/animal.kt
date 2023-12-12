package Learn.`Kotlin-OOP`.classAndObject.data

abstract class animal {
    abstract val name:String
    abstract val kelompok:String
    abstract val kelas:String
    abstract val description:String
    abstract fun printInfo():Unit
}

class Iguana():animal(){
    override val name = "Iguana"
    override val kelompok = "Reptil"
    override val kelas = "Reptilia; Laurenti, 1768"
    override val description = """
        Reptil adalah kelompok hewan vertebrata berdarah dingin dan memiliki sisik yang menutupi tubuhnya. 
        Reptilia adalah tetrapoda dan menelurkan telur yang embrionya diselubungi oleh membran amniotik. 
        Sekarang ini mereka menghidupi setiap benua kecuali Antarktika.
    """.trimIndent()
    override fun printInfo(){
        println("""
            Name       : $name
            Kelompok   : $kelompok
            Kelas      : $kelas
            Description: $description
        """.trimIndent())
    }
}

class Ayam():animal(){
    override val name = "Ayam"
    override val kelompok = "Unggas"
    override val kelas = "Aves"
    override val description = """
        Ayam adalah binatang unggas yang biasa dipelihara untuk dimanfaatkan daging, telur, dan bulunya. 
        Ayam peliharaan merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal 
        sebagai ayam hutan merah atau ayam bangkiwa.
    """.trimIndent()
    override fun printInfo(){
        println("""
            Name       : $name
            Kelompok   : $kelompok
            Kelas      : $kelas
            Description: $description
        """.trimIndent())
    }
}