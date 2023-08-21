import javax.print.attribute.standard.MediaSize.Other

sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)

}

data class BackendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 백엔드 개발자 입니다. ${language}를 사용합니다.")
    }

}

data class FrontendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 프론트엔드 개발자 입니다. ${language}를 사용합니다.")
    }
}

object OtherDeveloper : Developer() {

    override val name: String= "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

// 생성된 Developer 객체를 보관하거나 꺼내쓸 수 있는 pool
object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자 종류입니다")
//        else -> {
//            println("지원하지 않는 개발자입니다")
//        }  // Developer가 추상 클래스일 경우 상속하는 객체가 BackendDeveloper와 FrontendDeveloper 밖에 없지만, DeveloperPool은 모르므로 반드시 else를 써주어야 함 (안쓰면 컴파일 에러)
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "tony")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "Mark")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("tony"))
    println(DeveloperPool.get("Mark"))
}