package collection

fun main() {

    // Collection Builder
    // build 할 때는 내부에서 mutable, 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    val lowerList = listOf("a", "b", "c")
    val upperList = lowerList.map { it.uppercase() }
    val filteredList = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .toList()
}