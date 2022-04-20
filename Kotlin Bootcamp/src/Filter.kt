fun main () {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter { true }) // returns every element
    println(decorations.filter { it[0] == 'p' }) // returns every element
    eagerOrLazy()
}

fun eagerOrLazy() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager) // contains a new list with only the filtered elements in it

    // apply filter lazily
    val filtered = decorations.asSequence().filter {it[0] == 'p'}
    println(filtered) // does nothing
    println(filtered.toList()) // evaluates the filter and prints something

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
    }
    println(lazyMap) // lazy because nothing is evaluated
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}