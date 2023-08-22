class LateInit {

    lateinit var text:  String  // lateinit 키워드를 이용하여 가변 프로퍼티 & NonNullable이 아님에도 컴파일 오류 ❌

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        /*text = "Hi"
        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
            text = "안녕하세요"  // 지연 초기화
        }*/
        println(text)
    }

}

fun main() {
    val test = LateInit()

    if(!test.textInitialized) {  // 초기화가 되지 않은 경우
        test.text = "해윙"
    }

    test.printText()
}

