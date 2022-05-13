package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<T: BaseBuildingMaterial> (val buildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("${actualMaterialsNeeded} ${buildingMaterial::class.simpleName} required")
    }
}

fun main () {
    Building(Wood()).build()
    Building(Brick()).build()
}