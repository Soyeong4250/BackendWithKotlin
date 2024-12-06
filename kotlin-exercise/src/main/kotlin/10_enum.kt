enum class PaymentStatus(val label: String) {
    UNPAID("미지급"),
    PAID("지급완료"),
    FAILED("지급실패"),
    REFUNDED("환불")
}

fun main() {
    print(PaymentStatus.UNPAID.label)
}