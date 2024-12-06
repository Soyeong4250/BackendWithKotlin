// constructor 키워드를 생략한 채로 생성자 생성 가능
class Coffee constructor(
    var name:String = "",
    var price: Int = 0,  // 파라미터에 후행 쉼표 사용 가능
    var iced: Boolean = false,
    ){

    val brand: String  // val 키워드는 getter만 존재
        get() = "스타벅스"   // custom getter
    
    var quantity: Int = 0
        set(value) {
            if (value > 0) {  // 수량이 0 이상인 경우에만 할당
                field = value  // field는 getter, setter의 식별자 👉 quantity에 직접적으로 값을 하게 되면 무한재귀에 빠져 StackOverFlow Error 발생
            }
        }
}

//  본문 내용이 없는 클래스 생성 가능
class EmptyClas

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

//    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}")
    
    if (coffee.iced) {
        println("아이스 커피")
    }
}

