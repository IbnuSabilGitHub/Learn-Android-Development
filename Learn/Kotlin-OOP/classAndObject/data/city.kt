package Learn.`Kotlin-OOP`.classAndObject.data

open class city ( val name:String){

   open fun printInfoPublic(){
       println("City public $name")
    }
    private fun printInfoPrivate(){
        println("City private $name")
    }


    open protected fun printInfoProtected():String{
        return "City Protected $name"

    }

    open internal fun printInfoInternal(){
        println("City Internal $name")
    }
}


class streetAddress(name: String): city(name){
    override fun printInfoProtected():String{
        return "Street Address Protected $name"
    }

    override fun printInfoInternal() {
        print("""Memlalui turunan dari Fungsi PrintInfoInternal() akan mengambil return dari printInfoProtected yang telah di turunkan.
            ini adalah hasil dari return atau value fungsi printInfoProtected() yang telah di turunkan = ${printInfoProtected()}
        """.trimMargin())
    }


    

}