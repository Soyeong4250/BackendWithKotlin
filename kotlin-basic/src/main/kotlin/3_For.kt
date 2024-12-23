 fun main() {

    // 범위 연산자 ..를 사용해 for loop 돌리기
    /*for (i in  0 .. 3) {
        println(i)
    }*/

    // until 을 사용해 반복
    // 뒤에 온 숫자는 포함하지 않음
    /*for(i in 0 until 3) {
        println(i)
    }*/

    // step에 들어온 값만큼 증가
    /*for (i in 0..6 step 2) {
        println(i)
    }*/

    // downTo를 사용하여 반복하면서 값을 감소
    /*for (i in 3 downTo 1) {
        println(i)
    }*/

    // 전달받은 배열을 반복
    val numbers = arrayOf(1, 2, 3)

    for (i in numbers) {
        println(i)
    }
}