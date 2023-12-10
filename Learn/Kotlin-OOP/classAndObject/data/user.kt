package data

class user(var nickname: String, var password: String) {
    override fun equals(other: Any?): Boolean {
        return when(other){
            is user -> other.nickname == this.nickname
            else -> false
        }
    }
}