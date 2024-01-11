package Learn.`Kotlin-OOP`.classAndObject.app

import javax.print.attribute.standard.Media

data class user(val name:String, val email:String, val password:String)
//, val Modus:Int ,val Sorting :Array<Int>
data class returnMath(val Count:Int,val Min:Int, val Max:Int, val Modus:Int, val Median:Double, val Mean:Double, val Sorting:Array<Int>)

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

    data.bubbleSort()//sorting data
    var n = data.size//lenght data
    var countArr = 0//jumlah data

    val median:Double
    if(n % 2 != 0){ // jika median ganjil
        median = data[n/2].toDouble()
    }else{
        median = (data[n/2] + data[(n-1)/2]) / 2.0
    }

    var min = data[0]//deklarasi data terkecil
    var max = data[0]//deklarasi data terbesar
    var frequency = mutableMapOf<Int,Int>() // deklarasi frequency menggunakan mutableMapOf
    var maxFrequency = 0
    var modus = -1


    //forloop untuk mencari value minmax dan jumlah arr
    for ( value in data){
        if(value > min){
            min = value
        }
        if (value < max){
            max = value
        }
        countArr += value
        frequency[value] = frequency.getOrDefault(value, 0) + 1
    }

    //forloop untuk mendapatkan modu
    for((key,value) in frequency){
        if (value > maxFrequency) {
            maxFrequency = value
            modus = key
        }
    }

    val mean:Double = countArr/n.toDouble()


    return returnMath(countArr,min,max,modus,median,mean,data)
}

fun main() {

    val user = user("joko", "jokoEmail123@gmail.com", "joko123!#$")

//    println(user.name)
//    println(user.email)
//    println(user.password)

    val data = arrayOf(3, 1, 5, 7, 2, 8, 4, 6)
    val (name,email,password) = user

    println(name)
    println(email)
    println(password)

    val resultData = mathFunction(data)

    val (count,min,max,modus,median,mean,sorting) = resultData

    val result = """
        Jadi hasi data:
        jumlah   = $count
        minimum  = $min
        maxsimal = $max
        modus    = $modus
        median   = $median
        mean     = $mean
        sorting  = ${sorting.toList()}
    """.trimIndent()

    println(result)
}