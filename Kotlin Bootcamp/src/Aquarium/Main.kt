package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")
    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, height = 15, width = 30)

    val aquariumWithFish = Aquarium(numberOfFish = 9)
    println("aquarium with fish: " +
            " Length: ${aquariumWithFish.length}" +
            " Height: ${aquariumWithFish.height}" +
            " Width: ${aquariumWithFish.width}" +
            " Volume: ${aquariumWithFish.volume}")
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color} \n Pleco: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

fun feedFish(fish: FishAction) {
    fish.eat()
}