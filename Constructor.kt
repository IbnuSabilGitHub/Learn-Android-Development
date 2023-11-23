import data.Laptop

fun main() {
    var laptop = Laptop(
        "Hp",
        "VICTUS GAMING",
        2024
    )
    laptop.NoUnit = 654
    laptop.NoProduksi = 958
    println(laptop.brand)
    println(laptop.type)
    println(laptop.NoUnit)
    println(laptop.NoProduksi)
    println(laptop.TahunProduksi)
}

