package scope

fun main() {

    /*val client:DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    // 컨텍스트 객체의 레퍼런스 출력
    println(client)  // scope.DatabaseClient@677327b6

    val connected = client.connect()
    println(connected)  // connect() 출력

    client.connect().run {
        println(this)  // this = connect() 반환
    }*/

    DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
    }.connect().run { println(this) }

}