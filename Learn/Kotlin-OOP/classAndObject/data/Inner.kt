package Learn.`Kotlin-OOP`.classAndObject.data

class profesi(val Profesi:String) {

    abstract class dataPekerja(){
        abstract val name:String
        abstract val umur:Int
        abstract val gender:String
        abstract val profesi:String
         open fun printAll(){
            print("""
                Data $name
                nama    : $name
                umur    : $umur
                gender  : $gender
                profesi : $profesi
            """.trimIndent())
        }
    }
    inner class dataKobo():dataPekerja(){
        override val name = "Kobokanaeru"
        override val umur = 15
        override val gender = "Perempuan"
        override val profesi = this@profesi.Profesi
        override fun printAll() = super.printAll()

    }

    inner class dataBudi():dataPekerja(){
        override val name = "Budi"
        override val umur = 99
        override val gender = "pria"
        override val profesi = this@profesi.Profesi

        override fun printAll() = super.printAll()

    }
}