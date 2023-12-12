package data

class user(var nickname: String, var password: String) {
    override fun equals(other: Any?): Boolean {
        return when(other){
            is user -> other.nickname == this.nickname
            else -> false
        }
    }
}

class Description(des:String){
    var des:String = des
        get() {
            println("GETTTER")
            return field.uppercase()
        }
        set(value){
            if(value.isNotBlank()){
                println("SETTER")
                println("Mengubah nilai menjadi $value")
                field = value
            }else{
                println("Invaild")
            }
        }
}