/*fun main() {

    val list = mutableListOf(printHello)

    // 함수 사용 시에는 반드시 함수 실행 표기 "()"를 작성해 주어야 함
    // list[0]()  // Hello

    val func: () -> Unit  = list[0]
    func()  // Hello

    call(printHello)

    // val list2 = mutableListOf(printNo)  // 컴파일 오류 : 함수 호출에 대해 예상이 되므로
    // call(printNo)  // 컴파일 오류

    val result: Int = plus(1, 3)
    println(result)

}

val printHello : () -> Unit = { println("Hello") }
// val func : () -> String = { "" }

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()  // 인자로 받은 block 함수 실행
}

fun printNo() = println("No!")

val printMessage: (String) -> Unit = {message: String -> println(message)}
val printMessage2: (String) -> Unit = {message -> println(message)}
val printMessage3: (String) -> Unit = {println(it)}

// 다수의 인자를 받아 더하는 함수
val plus : (Int, Int) -> Int = {a, b -> a + b}
val plus2 : (Int, Int, Int) -> Int = {a, b, c -> a + b + c}*/


// 고차함수
/* fun main() {

    val list = listOf("a", "b", "c")
    val printStr : (String) -> Unit = { println(it) }

    forEachStr(list, printStr)

    list.forEach(printStr)

    val upperCase : (String) -> String = {it.uppercase()}
    println(list.map(upperCase))

}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for(item in collection) {
        action(item)  // println(item) 과 같은 역할
    }
} */

// 익명함수와 람다식
/*fun main() {

    // outerFunc()  // outerFunc()를 호출한 것이지 outerFunc() 내부의 익명함수를 호출한 것이 아니므로 아무것도 출력 ❌
    outerFunc()()  // 익명함수입니다.

    val func = outerFunc()
    func()  // 익명함수입니다.

    outerFunc2()()

    outerFunc3()()

}

fun outerFunc() : () -> Unit {

    return fun() {
        println("익명함수입니다.")
    }

}

// fun 키워드 생략
fun outerFunc2() : () -> Unit {
     return { println("익명함수입니다.") }
}

// return 생략
fun outerFunc3() : () -> Unit = {println("익명함수입니다.")}

// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
// 최대한 생략한 람다 식
val sum2 = {x: Int, y: Int ->  x + y}*/


// 후행 람다 전달
fun main() {

    val list = listOf("a", "b", "c")

    // val printStr : (String) -> Unit = {println(it)}

    forEachStr(list) {
        println(it)
    }

    list.forEach {
        println(it)
    }

    list.filter {
        it == "a"
    }

    // 람다 레퍼런스
//    val callReference : () -> Unit = { printHello() }
    val callReference = ::printHello

    callReference()()  // Hello

    val numberList = listOf("1", "2", "3")
    numberList.map { it.toInt() }.forEach { println(it) }

    numberList.map(String::toInt).forEach(::println)

}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val printHello : () -> Unit = { println("Hello") }