package Learn.`Kotlin-OOP`.classAndObject.app

data class Mahasiswa(val name: String, val nisn:Int, val age:Int, val gender:String, val fakultas:String)


fun main() {
    val mahasiswa = Mahasiswa("JIDAN", 38372, 20, "Laki-Laki", "Kedokteran")

    val FunctionLet = mahasiswa.let { """
        --Function let---
        Name     : ${it.name}
        NISN     : ${it.nisn}
        Age      : ${it.age}
        Gender   : ${it.gender}
        Fakultas : ${it.fakultas}
        
    """.trimIndent() }

    println(FunctionLet)

    val FunctionRun = mahasiswa.run { """
        --Function Run---
        Name     : ${this.name}
        NISN     : ${this.nisn}
        Age      : ${this.age}
        Gender   : ${this.gender}
        Fakultas : ${this.fakultas}
        
    """.trimIndent() }

    println(FunctionRun)

    val FunctionWith = with(mahasiswa) { """
        --Function With---
        Name     : ${this.name}
        NISN     : ${this.nisn}
        Age      : ${this.age}
        Gender   : ${this.gender}
        Fakultas : ${this.fakultas}
        
    """.trimIndent() }

    println(FunctionWith)


    val FunctionApply = mahasiswa.apply { """
        --Function Apply---
        Name     : ${this.name}
        NISN     : ${this.nisn}
        Age      : ${this.age}
        Gender   : ${this.gender}
        Fakultas : ${this.fakultas}
        
    """.trimIndent() }

    println(FunctionApply)

    val FunctionAlso = mahasiswa.also { null }

    println(FunctionAlso)

}