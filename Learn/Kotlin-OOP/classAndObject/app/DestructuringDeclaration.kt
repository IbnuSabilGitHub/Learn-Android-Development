package Learn.`Kotlin-OOP`.classAndObject.app

data class user(val name:String, val email:String, val password:String)
//, val Modus:Int ,val Sorting :Array<Int>
data class returnMath(val Max:Int, val Min:Int,val median:Int, val Mean:Int, val Sorting:Array<Int>)




fun Array<Int>.bubbleSort() {
    val n = this.size
    for (i in 0 until (n-1)){
        for (j in 0 until (n - i -1)){
            if (this[j] > this[j+1]) {
                val temp = this[j]
                this[j] = this[j+1]
                this[j+1] = temp
            }
        }
    }
}
fun mathFunction(data:Array<Int>):returnMath{

    data.sortedArray()//sorting data
    var n = data.size//lenght data
    var countArr = 0//jumlah data
    val median = data[n/2]//Menentukan Median dari data dengan n/2
    var min = data[0]//deklarasi data terkecil
    var max = data[0]//deklarasi data terbesar

    //forloop untuk mencari value minmax dan jumlah arr
    for ( i in data){
        if(i < min){
            min = i
        }
        if (i > max){
            max = i
        }
        countArr += i
    }
    val mean = countArr/n


    return returnMath(min,max,median,mean,data)
}

fun main() {

    val user = user("joko", "jokoEmail123@gmail.com", "joko123!#$")

//    println(user.name)
//    println(user.email)
//    println(user.password)

    val data = arrayOf(1,8,5,3,4,7,2,4,8,5,3,2,1,1,1,6,3,7,3)
    val (name,email,password) = user

    println(name)
    println(email)
    println(password)

    data.bubbleSort()
    println(data.toList())


    val resultData = mathFunction(data)

    val (min,max,median,mean,sorting) = resultData

    val result = """
        Jadi hasi data:
        minimum  = $min
        maxsimal = $max
        median   = $median
        mean     = $mean
        sorting  = ${sorting.toList()}
    """.trimIndent()

    println(result)
}