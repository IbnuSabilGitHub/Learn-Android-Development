package Learn.`Kotlin-OOP`.classAndObject.app

data class Fruit(val Total:Int){
     operator fun plus(fruit: Fruit):Fruit{
        return Fruit(this.Total + fruit.Total)
    }
}

fun main() {
    val data:Array<Fruit> = arrayOf(Fruit(17),Fruit(434),Fruit(843))
    val total = data[0] + data[1] + data[2]

    println(total.Total)


}