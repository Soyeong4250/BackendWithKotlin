package com.fastcampus.kotlinjava.keyword

enum class CountryCodeKotlin {
    kr, jp, us, `do`;  // 코틀린에서도 do~while문을 사용하여 do 예약어에 컴파일 에러 발생하므로 백틱문자 사용
}


fun main() {
    val javaKeyword = JavaKeyword()

    javaKeyword.`in`

    javaKeyword.`is`
}