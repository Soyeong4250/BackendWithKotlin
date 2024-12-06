fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    /*val a : String = null
    var b : String = "aabbcc"
    b = null*/


    var a : String? = null
//    println(a.length)
    println(a?.length)


    val b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자
    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // NPE가 발생할 수 있는 코드
//    throw NullPointerException()

//    val d: String? = null
//    val e = d!!.length  // 단언 연산자: Null이 발생하지 않는 안전한 코드라고 개발자가 컴파일러에게 알려주는 코드 (개발자가 체크해야하는 코드)

    println(Java_NullSafety.getNullStr().length)  // 코틀린에서 자바 코드를 실행할 때는 컴파일러가 Null을 확인하지 못하고 실행하므로 Nullable을 항상 염두에 두어야 함
    
}