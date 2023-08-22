fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {

    /*val result = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }*/

    // runCatching
    val result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }

    println(result)

    val result2 = runCatching { "성공" }
        .getOrNull()

    println(result2)  // 성공

    val result3 = runCatching { getStr() }
        .exceptionOrNull()

    /*result3?.let {
        println(it.message)
        throw it
    }
    println(result3)  // Exception 발생 (예외 발생 기본 값으로 초기화)*/

    val result4 = runCatching { getStr() }
        .getOrDefault("기본 값")
    println(result4)  // 기본 값


    val result5 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본 값"
        }
    println(result5)


//    val result6 = runCatching { getStr() }
//        .getOrThrow()  // Exception 발생


    val result7 = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }.getOrThrow()

    println(result7)  // 안녕하세요


    val result8 = runCatching { "안녕" }
        .mapCatching{
            throw Exception("예외")
        }.getOrDefault("기본 값")

    println(result8)


    val result9 = runCatching { getStr() }
        .recover { "복구" }
        .getOrNull()

    println(result9)  // 복구


    val result10 = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외 발생")
        }.getOrDefault("복구")

    println(result10)
}