import data.Laptop

fun main() {
    var LaptopHp = Laptop(
        "Hp",
        "VICTUS GAMING",
        
    )

    LaptopHp.NoUnit = 654
    LaptopHp.NoProduksi = 958
    println(LaptopHp.brand)
    println(LaptopHp.type)
    println(LaptopHp.NoUnit)
    println(LaptopHp.NoProduksi)
    println(LaptopHp.TahunProduksi)


    var LaptopAsus = Laptop("Asus")

    LaptopAsus.NoUnit = 654
    LaptopAsus.NoProduksi = 958
    println(LaptopAsus.brand)
    println(LaptopAsus.type)
    println(LaptopAsus.NoUnit)
    println(LaptopAsus.NoProduksi)
    println(LaptopAsus.TahunProduksi)
}

