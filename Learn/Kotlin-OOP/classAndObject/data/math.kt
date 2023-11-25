package data

class math(var arr: Array<Int>) {
    val lenghtArr = arr.size
    var count = 0

    fun ifThousand(){
        for (four in arr){
            for(three in arr){
                for(two in arr ){
                    for(one in arr){
                        if(one != 0){
                            count++
                            println("$count. = $one$two$three$four")
                        }
                    }
                }
            }
        }
        println("Bedasarkan data yang telah di berikan terdapat ($count) cara jika" +
                " Satu persatu data di jadikan angka ribuan")
    }


}