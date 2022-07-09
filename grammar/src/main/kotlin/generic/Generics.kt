package generic

class MyGenerics<T>(val t: T)
class Covariance<out T>(val t: T)
class ContraCovariance<T> {
    fun saveAll(to: MutableList<in T>, from: MutableList<T>) {
        to.addAll(from)
    }
}

fun main() {
    // 제네릭을 사용한 클래스의 인스턴스를 만들 때 타입아규먼트 제공
    val generics = MyGenerics<String>("테스트") // 타입 아규먼트 생략 가능

    // 변수의 타입에 제네릭 사용
    val list1: List<String> = listOf()

    // 타입 아규먼트를 생성자에서 추가
    val list2 = listOf<String>()

    // 정확한 타입을 모를 때 star projection 사용 가능
    val list3: List<*> = listOf("테스트")

    // PECS(Producer-Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭의 super 코틀린에선 in
    // 기본적으로는 무공변성이다. (MutableList<CharSequence> 와 MutableList<String> 은 다르다)

    // 공변성
    // CharSequence 가 String 보다 상위 클래스
    val stringObject = Covariance<String>("테스트")
    var charSequenceObject: Covariance<CharSequence> = stringObject

    // 반공변성
    // MutableList<String> 이 Mutable<CharSequence> 보다 상위 개념 (반공변성에서)
    val contraCovariance = ContraCovariance<String>()
    contraCovariance.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
}