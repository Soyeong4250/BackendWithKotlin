fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage() = println("확장 출력")

fun MyExample?.printNullOrNotNull() {
    if(this == null) println("Null인 경우에만 출력")
    else println("Null이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())  // A

    println("ABCD".addFirst('Z'))  // ZABCD

    MyExample().printMessage()  // 클래스 출력

    var myExample: MyExample? = null
    myExample.printNullOrNotNull()  // Null인 경우에만 출력, 내부에서 Null에 대한 처리를 하고 있어 컴파일러에서 NPE가 발생하지 않는다는 것을 알아 안전연산자(?)를 사용하지 않아도 에러 ❌

    myExample = MyExample()
    myExample.printNullOrNotNull()  // NUll이 아닌 경우에만 출력
}