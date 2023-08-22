package scope

fun main() {

    val str: String? = "안녕"

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        /*abc?.let {

            val def : String?  = "def"
            def?.let {
                println("abcdef가 null이 아님")
            }
        }*/

        // let 함수의 많은 중첩보다 가독성이 좋음
        val def: String? = "def"
        if(!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null 아님")
        }

        1234  // return 키워드를 사용하지 않았으나 let함수의 마지막 코드가 return 값에 해당
    }
    println(result)  // 1234

}