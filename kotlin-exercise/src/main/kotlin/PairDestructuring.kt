// Tuple
// f((1, 3)) = 1 + 3 = 4
// f(1, 3) = 1 + 3 = 4

/*data class Tuple(val a : Int, val b : Int)

fun plus(tuple: Tuple) = tuple.a + tuple.b

fun main()
{
//    println(plus(1, 3))
    val plus = plus(Tuple(1, 3))
    println(plus)
}*/


// Pair
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 1)
//    pair.first = "B"  // 컴파일 에러 (값 직접 수정 불가능)

    val newPair = pair.copy(first = "B")
    println(newPair)  // (B, 1)

    val second = newPair.component2()
    println(second)  // 1

    val list = newPair.toList()  // immutable 형태의 불변 리스트 제공
    println(list)

    // Triple
    val triple = Triple("A", "B", "C")
    println(triple)  // (A, B, C)
    triple.first
    triple.second
//    triple.third = "D"  // 컴파일 에러 (값 직접 수정 불가능)

    val newTriple = triple.copy(third = "D")
    println(newTriple)  // (A, B, D)
    println(newTriple.component3())  // D

    val(a: String, b: String, c: String) = newTriple
    println("$a $b $c")  // A B D

    val list3 = newTriple.toList()
    val (a1, a2, a3) = list3
    println("$a1 $a2 $a3")  // A B D


//    list3.component1()
//    list3.component2()
//    list3.component3()
//    list3.component4()
//    list3.component5()

    val map = mutableMapOf("이소영" to "개발자")
    for ((key, value) in map) {
        println("${key}의 직업은 $value")  // 이소영의 직업은 개발자
    }
}