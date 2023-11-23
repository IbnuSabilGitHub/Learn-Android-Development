package data

class Laptop (Brand:String, Type:String , Year:Int){
    init {
        println("Brand $Brand dengan type $Type Pada Tahun $Year")
    }
    var brand = Brand
    var type = Type
    var NoUnit = 0
    var NoProduksi = 0
    var TahunProduksi = Year

}