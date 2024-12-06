fun main() {

    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 싫행!!")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }
    println(a)

//    throw Exception("예외 발생!!")  // 직접적으로 예외 발생시키기

    val b: String? = null
    val c = b ?: failFast("a is null")  // Nothing 타입과 엘비스 연산자를 함께 사용할 경우 Null이 나올 수 없음

    println(c.length)
    
    failFast("예외 발생!!")

    println("이 메세지는 출력될까?")

}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}