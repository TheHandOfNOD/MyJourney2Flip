package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
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