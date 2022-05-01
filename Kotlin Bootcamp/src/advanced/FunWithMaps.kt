package advanced

fun main(args: Array<String>) {
    val cures = mapOf("white spots" to "Ich", "red sores" to "whole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "sorry I don't know"))
    cures.getOrElse("bloating") {println("No cure for it")}

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

    practiceWithCollections1()
}

fun practiceWithCollections1() {
    val allBooks = setOf("Hamlet", "Romeo and Julia")
    val library = mapOf("William Shakespeare" to allBooks)
    println("Contains hamlet? " + library.any(){it.component2().contains("Hamlet")})

    val moreBooks = mutableMapOf("William Shakespeare" to allBooks)
    println(moreBooks.getOrPut("Rowling"){setOf("Harry Potter 1", "Harry Potter 2")})
    
}