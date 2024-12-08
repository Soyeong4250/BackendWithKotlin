package scope

class User(val name: String, val password: String) {

    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공!")
        } else {
            println("검증 실패!")
        }
    }

    fun printName() = println(name)

}

fun main() {

//    val user: User = User(name = "tony", password = "1234")
//    user.validate()

    User(name = "tony", password = "1234").also {
        it.validate()
        it.printName()
    }

    // 스코프 함수 사용 시 유의할 점
    val hello = "hello"
    val hi = "hi"

    hello.let{ a : String ->
        hi.let { b ->
            println(a.length)
            println(b.length)
        }
    }
}