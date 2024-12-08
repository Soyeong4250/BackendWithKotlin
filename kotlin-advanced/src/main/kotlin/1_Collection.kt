import java.util.ArrayList
import java.util.LinkedList
import java.util.stream.Collectors

fun main() {

    // immutable
    val currencyList = listOf("달라", "유로", "원")  // list를 만들어주는 팩토리 (표준 라이브러리)

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable
//     val mutableCurrencyList = mutableListOf<String>()
//     mutableCurrencyList.add("달러")
//     mutableCurrencyList.add("유료")
//     mutableCurrencyList.add("원")

    val mutableCurrencyList = mutableListOf<String>().apply {  // inline 함수
        add("달러")
        add("유로")
        add("원")
    }

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1  // 리터럴 문법 사용
//    mutableNumberMap.put("two", 2)  // 코틀린에서는 put()을 권장하지 않음
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3


    // 컬렉션 빌더는 내부에서는 mutable 반환은 immutable
    val numberList = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }


    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        add(2)
        addLast(3)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    /*val iterator = currencyList.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    println("======================")

    for (currency in currencyList) {
        println(currency)
    }

    println("======================")

    currencyList.forEach {
        println(it)
    }*/

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
    /*val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }*/

    val upperList = lowerList.map { it.uppercase() }

    println(upperList)


    // filter
    /*val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }*/

    val filteredList = upperList.filter { it == "A" || it == "C" }

    // Java8의 Stream
    val filteredListByJava = upperList.stream().filter {it == "A" || it == "C"}.collect(Collectors.toList())

    println(filteredList)  // [A, C]
    println(filteredListByJava)  // [A, C]
}
