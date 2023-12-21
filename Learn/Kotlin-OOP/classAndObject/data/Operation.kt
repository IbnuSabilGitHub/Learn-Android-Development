package Learn.`Kotlin-OOP`.classAndObject.data


sealed class OperationNum(OperationNum:String);

class Plus: OperationNum("tambah")
class Minus: OperationNum("kurang")
class Bagi: OperationNum("bagi")
class Modulo: OperationNum("modulo")
class Perbandingan: OperationNum("perbandingan")
class Equals: OperationNum("equals")


