
// contoh deklarasi const pada kotlin. berguna untuk pemanggilan global
const val date = "30/10/2023" // dikarenakan const nilai tidak akan berubah
fun main (){
//    Menggunakan deklarasi variabel val jika data nya constan atau tidak berubah
    val programmerLanguage =  "Kotlin"
    println(programmerLanguage)


//    Membuat value menjadi null atau tidak add
    val valueNull: String? = null
    println(valueNull)
    println(valueNull?.length)// jika pemanggilan fungsi harus di seretai ?

    println(date)
}