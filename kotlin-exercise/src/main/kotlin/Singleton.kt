import java.time.LocalDateTime

/*object Singleton {

    val a = 1234

    fun printA() = println(a)

}

fun main() {
    println(Singleton.a)
    Singleton.printA()
}*/

/*object DatetimeUtils {

    val now : LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"  // JAVA의 상수와 유사

    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
        return a == b
    }
}

fun main() {
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)

    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))
}*/

class MyClass {

    private constructor()

    companion object {
        val a = 1234

        fun newInstance() = MyClass()  // MyClass가 직접 생성자를 통한 객체 생성을 막기 위해
    }

}

class MyClass2 {
     private constructor()

    companion object MyCompanion {
        val b = 5678

        fun newInstance() = MyClass2()  // MyClass2가 직접 생성자를 통한 객체 생성을 막기 위해
    }
}

fun main() {
    println(MyClass.a)
    println(MyClass.newInstance())

    println(MyClass.Companion.a)
    println(MyClass.Companion.newInstance())

    println(MyClass2.MyCompanion.b)
    println(MyClass2.MyCompanion.newInstance())
}