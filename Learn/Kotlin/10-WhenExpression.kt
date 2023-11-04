fun main() {
    val nilaiSiswa =   69
    var skorSiswa: Char? = null

    when{
        nilaiSiswa >= 90 -> skorSiswa = 'A'
        nilaiSiswa >= 80 -> skorSiswa = 'B'
        nilaiSiswa >= 70 -> skorSiswa = 'C'
        nilaiSiswa >= 60 -> skorSiswa = 'E'
        else  -> skorSiswa = 'F'
    }

    val syaratLulus = arrayOf('A','B','C')
    var kelulusan: String? = null
    when(skorSiswa){
        in syaratLulus -> kelulusan = "Lulus"
        !in syaratLulus -> kelulusan = "Tidak Lulus"
    }

//    when(kelulusan){
//        is String -> print("string")
//        !is String -> print("not string")
//    }
    val output = """
        -----Hasil Penilaian Ujian programan koltin-----
        Nilai : $nilaiSiswa
        Skor  : $skorSiswa
        Dengan ini kmau di nyatakan $kelulusan dalam ujian programan kotlin
    """.trimIndent()
    print(output)
}