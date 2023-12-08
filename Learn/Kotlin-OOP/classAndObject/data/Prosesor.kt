package Learn.`Kotlin-OOP`.classAndObject.data

class cpu(val Product:String, val Type){
    val core:Int? = null
    val threads:Int? = null
    val maxTurboFrequency: Int? = null
    val cache:Int? = null
    val baseClock:Int? = null
    val TDP:Int? = null
    fun printSpecifications(){
        println("""
            Product        : $Product
            Type           : $Type
            Total Cores    : $core
            Total Threads  : $threads
            Max Boost Clock: $maxTurboFrequency GHz
            Cache          : $cache MB
            base Clock     : $baseClock GHz
            TDP            : $TDP W
        """.trimIndent())
    }
}

class gpu(val Product:String, val Type){
    val core:String? = null
    val boostClock:String? = null
    val baseClock:String? = null
    val standardMemoryConfiguration:String? = null
    val memoryInterfaceWidth:String? = null
    val rayTracingCore:String? = null
    val tensorCore:String? = null
    val architecture:String? = null
    val directX:Boolean? = null
    val DLSS:Boolean? = null
    val Reflex:Boolean? = null
    fun printSpecifications(){
        println("""
            Product                      : $Product
            Type                         : $Type
            Total Cores                  : $core
            Boost Clock                  : $boostClock GHz
            Base Clock                   : $baseClock GHz
            Standard Memory Configuration: $standardMemoryConfiguration
            Memory Interface Width       : $memoryInterfaceWidth
            Ray Tracing Core             : $rayTracingCore
            Tensor Core                  : $tensorCore
            NVIDIA architecture          : $architecture
            DirectX                      : $directX
            DLSS                         : $DLSS
            Reflex                       : $Reflex
            
        """.trimIndent())
    }

}