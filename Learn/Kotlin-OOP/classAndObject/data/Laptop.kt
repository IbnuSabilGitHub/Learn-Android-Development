package data

import kotlin.contracts.contract

class Laptop (Brand:String, Type:String , Year:Int){
    init {
        println("Brand $Brand dengan type $Type Pada Tahun $Year")
    }
    constructor(Brand:String, Type:String) : this(Brand, Type, 2014){
        println("Constructor 1 di buat")
        }
    constructor(Brand:String) : this(Brand, "Unknown"){
        println("Constructor 2 di buat")
    }


    var brand = Brand
    var type = Type
    var NoUnit = 0
    var NoProduksi = 0
    var TahunProduksi = Year

}