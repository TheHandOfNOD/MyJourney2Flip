package deepintolambdas

import advanced.num

val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
val manipulating = {
    numbers.filter { it.mod(3) == 0 || it == 0 }
}

fun main () {
    println(manipulating.invoke())
    println(numbers.divisibleBy({it.rem(3)}))
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}