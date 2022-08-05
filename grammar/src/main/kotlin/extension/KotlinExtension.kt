package extension

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this
}

fun main() {
    println("ABC".first())
    println("ABC".addFirst('Z'))
}
