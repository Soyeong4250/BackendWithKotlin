class MyGenerics<T>(val t:T) {

}

class MyGenerics2<out T>(val t:T) {

}

class Bag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ){
        to.addAll(from)
    }
}

fun main() {

    // 제네릭을 사용한 클래스의 인스턴스를 만드려면 타입 argument를 제공
    val generics = MyGenerics<String>("테스트")  // 인자에 String 타입의 데이터가 들어가 있어 컴파일러가 자동으로 추론해주므로 제네릭 생략 가능

    // 변수의 타입에 제네릭을 사용한 경우
    val lsit1: MutableList<String> = mutableListOf()

    // 타입 argument를 생성자에서 추가
    val list2 = mutableListOf<String>()

    // star-projections : 어떤 타입이 들어올지 알 수 없을 때 안전하게 사용하고 싶은 경우 사용
    val list3 : List<*> = listOf<String>("테스트")
    val list4 : List<*> = listOf<Int>(1, 2, 3, 4)

    // 공변성
    val generics2 = MyGenerics2<String>("테스트")

    val charGenerics : MyGenerics2<CharSequence> = generics2  // CharSequence가 String보다 상위 타입이기 때문에 공변성 구현 가능

    // 반공변성
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))  // in 키워드를 이용하여 String이 CharSequence보다 상위 개념이 되어 반공변성 구현이 가능

}