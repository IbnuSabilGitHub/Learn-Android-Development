package Learn.Kotlin

//Function untuk mendapatkan nilai max dari arr
fun maxValue(arr:Array<Int>):Int{
    // Deklarasi max yang value nya arr index ke 0
    var max = arr[0]
    //forloop
    for (value in arr){
        //Jika value lebih besar dari max maka max akan sama denga value
        if(value > max) max = value
    }
    return max
}

fun main() {
    //data deret
    val data = arrayOf(3,8,5,3,6,3,4,6,9,1,5)
    //Print dengan memanggil fungsi maxValue
    println("Jadi Max dari data adalah ${maxValue(data)}")

}