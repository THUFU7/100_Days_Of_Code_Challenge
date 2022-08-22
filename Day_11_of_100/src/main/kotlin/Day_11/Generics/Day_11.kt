package Day_11.Generics
open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}
fun main(args: Array<String>) {
    Building(Wood()).build()
}










//open class WaterSupply(var needsProcessed: Boolean)
//class TapWater: WaterSupply(true){
//    fun addChemicalCleaners(){
//        needsProcessed = false
//    }
//}
//class FishStoreWater: WaterSupply(false)
//class LakeWater: WaterSupply(true){
//    fun filter(){
//        needsProcessed = false
//    }
//}
//class Aquarium<T: WaterSupply>(val waterSupply: T) {
//    fun addWater() {
//        check(!waterSupply.needsProcessed) { "water supply needs processed" }
//        println("adding water from $waterSupply")
//    }
//}
//fun genericExample(){
//    val aquarium = Aquarium(TapWater())
//    aquarium.waterSupply.addChemicalCleaners()
//    val aquarium2 = Aquarium(LakeWater())
//    aquarium2.waterSupply.filter()
//    aquarium2.addWater()
//
//}