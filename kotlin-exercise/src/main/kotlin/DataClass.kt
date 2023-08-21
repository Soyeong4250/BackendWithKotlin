data class Person (val name: String, val age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//
//        return true
//    }

//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }
}

fun main() {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    println(person1 == person2)  // 일반 class일 경우 false, data class일 경우 true

    val hashSet = hashSetOf(person1)
    println(hashSet.contains(person2))  // hashCode가 주석일 경우에는 false, 주석이 아닐 경우에는 true

    println(person1.toString())  // 일반 class일 경우 Person@5451c3a8, data class일 경우 Person(name=tony, age=12)

}
