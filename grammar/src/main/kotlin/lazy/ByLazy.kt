package lazy

class HelloBot {

    private val greeting: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    for (i in 1..10) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}