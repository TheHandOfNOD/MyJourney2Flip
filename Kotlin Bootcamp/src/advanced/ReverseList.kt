package advanced

import java.util.*

fun main() {
    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
    println(myList)
    Collections.reverse(myList)
    println(myList)
    reverseAtOwnPace(myList)
    reverseAtOwnPaceWithDownTo(myList)
    println("\nKotlin way: ")
    println(myList.reversed()) // returns a new list
    println(myList.reversed()) // proofed
}

fun reverseAtOwnPace(myList: List<Int>) {
    println("reverse at own pace")
    print("[")
    for (i in 0..myList.size-1) {
        print(myList[myList.size-i-1].toString() + ", ")
    }
    print("]")
}

fun reverseAtOwnPaceWithDownTo(myList: List<Int>) {
    println("\nreverse at own pace with down to")
    print("[")
    for (i in myList.size-1 downTo 0) {
        print(myList.get(i).toString() + ", ")
    }
    print("]")
}