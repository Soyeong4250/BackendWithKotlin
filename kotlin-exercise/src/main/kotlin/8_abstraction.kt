abstract class Developer {

    abstract var age: Int
    abstract  fun code(language: String)

}

class BackendDeveloper(override  var age : Int = 0) : Developer() {  // abstract 키워드로 되어 있는 클래스나 프로퍼티는 하위 클래스에서 반드시 구현해야 함

//    override var age: Int = 0

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}