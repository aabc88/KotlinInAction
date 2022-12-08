import chap01.Person

fun main(args: Array<String>) {
    
}

fun chap01() {
    val personList = listOf<Person>(
        Person("철수"),
        Person("영희", 20)
    )

    val oldest = personList.maxBy { it.age ?: 0 }
    println("나이가 많은 사람은 ${oldest.name} 입니다.")
}