package Aquarium.Generics

fun main() {
    genericExample()
}
open class WaterSupply(var needsProcessed: Boolean) {
}

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}
class Aquarium<T: WaterSupply>(val waterSupply: T) // by default <T> means <T: Any?>
{
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $waterSupply")
    }
}

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
//
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}