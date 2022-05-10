package deepintolambdas

// 'cause I like to keep my try outs
val waterFilter = {dirty: Int -> dirty / 2}
data class Fish (val name: String)
val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("dory"))

fun main () {
    println(waterFilter(30))
    println(myFish.filter { it.name.contains("i") }.joinToString(" ") { it.name })
}


