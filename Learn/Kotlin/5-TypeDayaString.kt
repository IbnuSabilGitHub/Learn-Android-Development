fun main() {
    var firstName: String = "Ibnu"
    var lastName: String = " Sabil"
    var fullName: String = "$firstName$lastName"

    var age: Int = 17

    var data: String = """
        Nama: $fullName
        Age: $age
        --di isi pada 29/10/2023
    """.trimIndent()
    
    println(data)

}