class HelloBot {

    // var greating : String? = null
    val greating: String by lazy(LazyThreadSafetyMode.PUBLICATION) {  // 멀티스레드 환경이어도 동기화가 필요없음
        println("초기화 로직 수행")
        getHello()
    }  // 변수를 사용하는 시점에 by lazy로 선언한 내부 코드 동작

    fun sayHello() = println(greating)

}

fun getHello() = "hello"

fun main() {
    val helloBot = HelloBot()

    // 특정 로직 수행 중...

//    helloBot.greating = getHello()
    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }

}