package specialclasses

object MobyDickWhale { //singleton

}


enum class Color(val rbg: Int) { //enumeration: Singleton and you cannot make more than the defined enums
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal { //can be inherited, but only inside the same file it is declared. That way Kotlin knows all possible subclasses at compile time

}

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
        is CrazySeal -> "crazy seal: outside file"
    }
}