package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishColor {
    val color: String
}

class Pleco(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("algae"),
    FishColor by GoldColor

object GoldColor: FishColor { //singleton
    override val color: String = "gold"
}

object RedColor: FishColor {
    override val color: String = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}