import kotlin.random.Random

fun main() {
    val swim = {println("swim")}
    swim()
    val waterFilter = {dirty: Int -> dirty / 2}
    println(waterFilter(10))

    val rollDice = {sides: Int -> if (sides == 0) 0 else Random(4).nextInt(1,12)}
    val rollDice2: (Int) -> Int = { sides ->
        println("In roll of dice 2")
        if (sides == 0) 0 else Random(1).nextInt(sides) + 1
    } // function type notation
    println("Roll of dice")
    gameplay(rollDice)
    println("Roll of dice 2")
    gamePlay2(rollDice2(10))
}

fun gameplay(rollOfDice: (Int) -> Int) {
    println(rollOfDice(4))
}

fun gamePlay2(rollOfDice: Int) {
    println(rollOfDice)
}