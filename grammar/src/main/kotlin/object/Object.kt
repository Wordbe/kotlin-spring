package `object`

import java.time.LocalDateTime

object DateTimeUtils {
    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"
}

class MyClass private constructor() {

    companion object MyCompanion {
        val a = 1

        fun newInstance() = MyClass()
    }
}

fun main() {
    println(DateTimeUtils.now)
    println(DateTimeUtils.DEFAULT_FORMAT)

    println(MyClass.a)
    println(MyClass.newInstance())
    println(MyClass.MyCompanion.a) // 보통 컴패년 이름은 생략해서 사용한다.
    println(MyClass.MyCompanion.newInstance())
}