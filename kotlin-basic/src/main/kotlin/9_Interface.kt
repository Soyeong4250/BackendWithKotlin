
class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart: Wheel {

    var coin: Int  // 추상 프로퍼티

    val weight: String
        get() = "20KG"  // getter 접근자를 통한 프로퍼티. 인터페이스의 경우 backing field를 사용하면 컴파일 에러 발생.

    fun add(product: Product)

    fun rent() {  // default 함수 (Cart 내부에서 구현해야 하는 함수)
        if (coin > 0) {
            println("카트를 대여합니다")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId() = println("1234")
}

interface Order {

    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다")
    }

    fun printId() = println("5678")
}

class MyCart(override var coin: Int): Cart, Order {  // 인터페이스 구현 시에는 생성자 호출이 아닌 인터페이스명만 호출

    override fun add(product: Product) {  // 추상 함수이기 때문에 override 키워드를 이용하여 구현
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가되었습니다")
        
        // 주문하기
        super<Order>.add(product)

    }

    // 2개의 인터페이스에서 동일한 시그니처의 디폴트 함수를 제공하는 경우 하위 클래스에서 구현을 강제하게 됨
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name="장난감", price=1000))
    cart.printId()
}