package domain

import java.time.LocalDate
import java.util.UUID

class Student {
    @JvmField // getName(), setName() 대신 .name 으로 접근할 수 있음
    var name: String? = null
    var birthDate: LocalDate? = null
    val age: Int = 10
    var grade: String? = null
        private set

    fun changeGrade(grade: String) {
        this.grade = grade
    }

    // 프로퍼티는 없지만, 프로퍼티처럼 사용할 수 있다.
    fun getUUID(): String {
        return UUID.randomUUID().toString()
    }

    // 만약 게터가 없으면, 세터가 있음에도 컴파일 오류가 발생한다.
}