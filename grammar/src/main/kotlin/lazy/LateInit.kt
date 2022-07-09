package lazy

class LateInit {

    lateinit var text: String

    fun printText() {
        if (this::text.isInitialized) { // 이런식으로 초기화 확인가, 클래스 외부에서는 사용할 수 없음
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }
        println(text)
    }

    // 외부에서 사용하려면 아래와 같이 getter 로 만든다.
    val textInitialized: Boolean
        get() = this::text.isInitialized
}

fun main() {
    val lateInit = LateInit()
    lateInit.printText()
}