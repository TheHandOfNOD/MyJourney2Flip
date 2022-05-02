package advanced

const val rocks = 3
val number = 5
const val num = 5 // value is determined during compile time
fun complexFunctionCall() {}
val result = complexFunctionCall() // value is determined during runtime
//const val result2 = complexFunctionCall() // not possible, because the value must be determined during compile time
const val CONSTANT = "top level constant"
object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2


class MyClass {
    companion object { // companion object is initialized from the static constructor of the containing class
        const val CONSTANT3 = "companion constant"
    }
}