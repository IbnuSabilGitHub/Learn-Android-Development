fun main() {
    var n = 10
    loop_i@for (i in 1..n){
        loop_j@ for(j in 1..i){
            if(i % 2 == 0){
                continue@loop_i
            }
          print("*")
        }
        println()
    }
    
}