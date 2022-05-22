package deepintolambdas

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path = mutableListOf(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(direction: String?): Boolean {
        var isContinue = false
        when (direction) {
            "n" -> {
                move(north)
                isContinue = true
            };
            "s" -> {
                move(south)
                isContinue = true
            }
            "e" -> {
                move(east)
                isContinue = true
            }
            "w" -> {
                move(west)
                isContinue = true
            }
            else -> move(end)
        }
        return isContinue
    }
}

fun main () {
    val game: Game = Game()
    var isRun = true
    while (isRun) {
        print("Enter a direction (n/s/e/w): ")
        isRun = game.makeMove(readLine())
    }
}