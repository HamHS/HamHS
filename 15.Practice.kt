package com.example.myapplication.Kotlin

fun main() {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4) // 인덱스를 설정하지 않으면 맨뒤로 감.
    println(a)
    a.add(0, 100)
    //add는 칸 밀어서 0번째에 100을 넣음. 1 2 3 4 -> 100 1 2 3 4
    println(a)
    a.set(0, 200)
    //set은 해당 엘리먼틀를 교체함. 100 1 2 3 4 -> 0 1 2 3 4
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    b.add(2) // 셋은 애초에 인덱스가 없어 설정해줄 필요없음
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}