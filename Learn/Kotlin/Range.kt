fun main() {
//    val range = 1..500
//    val range = 500 downTo 1
//    val range = 500 downTo 1 step 5
    val range = 1..500 step 10
    println(range)
    println(range.count())
    println(range.contains(149))
    println(range.contains(501))
    println(range.first)
    println(range.last)
    println(range.step)
}