enum class PaymentStatus(val label: String): Payable {
    UNPAID("미지급") {
        override fun isPayable():  Boolean = true
    },
    PAID("지급완료") {
        override fun isPayable():  Boolean = false
    },
    FAILED("지급실패") {
        override fun isPayable():  Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable():  Boolean = false
    };   // 함수를 정의하기 전에는 ;으로 구분

//    fun isPayable(): Boolean = false  // 초깃값 설정 (동적 x)
//    abstract fun isPayable(): Boolean

}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
//    println(PaymentStatus.UNPAID.label)
//
//    if (PaymentStatus.UNPAID.isPayable()) {
//        println("결제 가능 상태")
//    }

//    val paymentStatus = PaymentStatus.valueOf("PAID")  // 인자로 들어온 String을 가지고 enum 클래스의 상수와 일치하는 프로퍼티를 찾아 바로 인스턴스화 시켜줌
//    println(paymentStatus.label)
//
//    // 동등성 비교 (equals 연산자)
//    if (paymentStatus == PaymentStatus.PAID) {
//        println("결제 완료 상태")
//    }

    for (status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}