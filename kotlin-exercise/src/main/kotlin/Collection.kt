import java.util.ArrayList
import java.util.LinkedList

fun main() {

    // immutable
    val currencyList = listOf("달라", "유료", "원")

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable
//     val mutableCurrencyList = mutableListOf<String>()
//     mutableCurrencyList.add("달러")
//     mutableCurrencyList.add("유료")
//     mutableCurrencyList.add("원")

    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유료")
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

    println(filteredList)
}