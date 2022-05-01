package advanced

fun main() {
    tryPairs()
}

fun tryPairs() {
    val equipment = "fishnet" to "catching fish" // creates a pair
    println(equipment.first) // access the first #component() -> fishnet
    println(equipment.second) // access the second #component() -> catching fish

    val extendedEquipment = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(extendedEquipment) // -> (((fishnet, catching fish), of big size), and strong)
    println(extendedEquipment.first) //((fishnet, catching fish), of big size)
    println(extendedEquipment.first.first) // (fishnet, catching fish)
    println(extendedEquipment.first.second) // of big size

    val parenthesisEquipment = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    println(parenthesisEquipment.first.first) // fishnet
    println(parenthesisEquipment.second.second) // and strong

    //destructuring part
    val fishnet = "fishnet" to "catching fish"
    val (tool, use) = fishnet
    println("The $tool is a tool for $use")

    val (tool2, use2) = giveMeATool()
}

// to demonstrate the use of destructuring
fun giveMeATool(): Pair<String, String> = "fishnet" to "catching"