open class Dog { // open 키워드를 통해 상속이 가능해짐
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(final override var age:Int = 0) : Dog() { // Dog 클래스 상속받음

//    override var age: Int = 0
    
    final override fun bark() {
//        println("컹컹")
        super.bark()  // 상위 클래스의 프로퍼티를 그대로 사용
    }

}

/*class ChildBulldog : Bulldog() {
    override var age: Int = 0  // 컴파일 오류: Bulldog 객체의 override 된 age 프로퍼티는 final 키워드를 이용하여 상속을 막음
    override fun bark() {  // 컴파일 오류: Bulldog 객체의 override 된 bark 프로퍼티는 final 키워드를 이용하여 상속을 막음
        super.bark()
    }
}*/

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()
}