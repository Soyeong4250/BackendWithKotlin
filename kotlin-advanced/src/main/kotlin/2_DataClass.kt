/*class Person (val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}*/

data class Person (val name: String, val age: Int)

fun main() {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    // equals
    /*println(person1 == person2)

    //  hashCode
    val set = hashSetOf(person1)
    println(set.contains(person2))*/

    // toString
    println(person1.toString())

    val person3 = person1.copy()
}

