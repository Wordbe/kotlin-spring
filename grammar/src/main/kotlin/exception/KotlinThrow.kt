package exception

import java.io.IOException

class KotlinThrow {

    @Throws(IOException::class) // 코틀린은 예외처리를 강제하지 않지만, exception 전파를 하고 싶을 때 사용
    fun throwIOException() {
        throw IOException()
    }
}