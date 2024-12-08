package scope

class DatabaseClient {  // 수신 객체
    var url: String? = null
    var username: String? = null
    var password: String? = null


    // DB에 접속하고 Boolean 결과를 반환
    fun connect(): Boolean {
        println("DB 접속 중 ...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}

fun main() {

    /*val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected = config.connect()*/

    // run
    val connected = DatabaseClient().run {
        url = "localhost:3306"  // 수신자 객체(this)에 대한 참조를 자동으로 해주어 this 생략 가능
        username = "mysql"
        password = "1234"
        connect()
    }

    println(connected)

    // let
    val connected2 = DatabaseClient().let {
        it.url = "localhost:3306"
        it.username = "mysql"
        it.password = "1234"
        it.connect()
    }

    println(connected2)
}