package data

open class Employee (val name:String){
    open fun introduction(otherName:String? = null){
        val intoroductionOutput = if (otherName != null){
            "Hallo nama saya ${this.name}, sering di panggil $otherName"
        }else{
            "Hallo nama saya ${this.name}"
        }
        println(intoroductionOutput)
    }


}

class noAbsen11(name: String) : Employee(name)
class family(name: String) : Employee(name)

open class ketua(name: String) : Employee(name){
   final override fun introduction(otherName: String?) {
        val intoroductionOutput = if (otherName != null){
            "Hallo saya ${this.name}, saya bertanggung jawab sebagai ketua. saya sering di panggil $otherName"
        }else{
            "Hallo saya ${this.name}, saya bertanggung jawab sebagai ketua."
        }
        println(intoroductionOutput)
    }
}

class wakil(name: String): ketua(name) {
//    Eror
//    override fun introduction(otherName: String?) {
//        super.introduction(otherName)
//    }
}

