fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println("== Curry filter")
    spices.filter { it.contains("curry") }.sortedBy { it.length }.forEach(::println)
    println("== special filter: first way")
    spices.filter { it.startsWith('c') && it.endsWith('e') }.forEach(::println)
    println("== special filter: second way")
    spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }.forEach(::println)
    println("== sublist filter")
    spices.subList(0,3).filter { it.startsWith('c') }.forEach(::println)
    println("== take filter")
    spices.take(3).filter { it.startsWith('c') }.forEach(::println)
}