package `object`

class HelloClass {
    companion object {
        @JvmStatic
        fun hello() = "hello"

        @JvmField
        val id = 1234
        const val CODE = "C99"
    }
}

object HiObject {
    @JvmStatic
    fun hi() = "hi"

    @JvmField
    val name = "tony"
    const val FAMILY_NAME = "Kim"
}

fun main() {
    val hello = HelloClass.hello();
    val hi = HiObject.hi()
    println("$hello $hi")

    val id = HelloClass.id
    val name = HiObject.name
    println("$id $name")
}