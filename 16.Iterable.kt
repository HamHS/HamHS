package com.example.myapplication.Kotlin

//16. Iterable

fun main() {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 1
    for (item in a) {
        if (item == 5) {
            println("item is five")
        } else {
            println("item is not five")
        }
    }
    println()

    // 반복하는 방법 2
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value: " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 모든것 = 문자열
    }
    println()
    // 반복하는 방법 3
    a.forEach() {
        println(it)
    }
    println()
    // 반복하는 방법 4
    a.forEach() { item ->
        println(item)
    }

    println()
    // 반복하는 방법 5
    a.forEachIndexed { index, item ->
        println("index : " + index + " value: " + item)
    }
    // 반복하는 방법 6
    println()
    for (i in 0 until a.size) {
        // until 은 마지막을 포함하지 않는다
        // 0부터 8까지 이다.
        println(a.get(i))
    }
    println()

    // 반복하는 방법 7
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 8
    for (i in a.size - 1 downTo (0)) {
        // 8부터 0 까지 반복
        println(a.get(i))
    }
    println()

    // 반복하는 방법 9
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 10
    for (i in 0..a.size) {
        // .. -> 마지막을 포함한다.
        println(i)
    }
    println()
    // 반복하는 방법 11
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++ //while 문을 정지 시키기 위한 코드
        println("b")
    }
    println()

    var d : Int = 0
    var e : Int = 4
    // 반복하는 방법 12
    do {
        println("hello")
        d++
    }while (d < e) // do 문은 while 문과 상관없이 한번 실행된다.

}