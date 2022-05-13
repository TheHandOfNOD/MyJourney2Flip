package Aquarium5

data class Fish (var name: String)

fun main (args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish ("splashy")
    myWith (fish.name) {
        println(capitalize())
    }
    // useful High order functions in the standard library
    println(fish.run { name }) // returns the result of the function
    fish.apply {  } // returns the object on which the function is applied (in this example "fish)

    val fishWithApply = Fish("splashy2").apply { name = "Sharky" }
    println(fishWithApply.name)

    println(fish.let { it.name.capitalize()} // let returns a copy of the changed object. It is particularly useful for chaining manipulations together
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 } ) // prints 42
}

/*
  block is the default name in Kotlin for function parameters
  After the colon the "receiver" object is defined -> that's the class which is extended
  After the "->" the return is defined, in this case "Unit" is used because nothing is returned
 */
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}