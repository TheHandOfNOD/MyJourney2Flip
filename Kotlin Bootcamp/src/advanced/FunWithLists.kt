package advanced

fun main() {

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    symptoms.contains("red")
    symptoms.contains("red spots")

    println(symptoms.subList(4, symptoms.size))

    println(listOf(1,4,5,6,7).sum())
    listOf("a", "b", "c").sumBy{it.length}
}