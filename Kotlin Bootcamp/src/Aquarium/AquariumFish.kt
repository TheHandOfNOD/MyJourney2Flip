package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color: String = "gold"
    override fun eat() {
        println("munch on algae")
    }
}