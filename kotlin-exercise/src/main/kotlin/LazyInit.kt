class HelloBot {

    // var greating : String? = null
    val greating: String by lazy {  // 호출된 최초 1회만 수행
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