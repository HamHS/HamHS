package com.example.myapplication.Kotlin

fun main() {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
    // val number1 = array.get(100)//인덱스에 주의해야 한다
    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    // array.set(100, 100) 셋을 할때에도 인덱스에 주의
    // array 의 bounds 는 처음 만들때 결정된다

    //array 를 만드는 방법 3
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a') //char -> '' , string -> ""
    val a3 = doubleArrayOf(1.2, 100.5)
    val a4 = booleanArrayOf(true, false)

    //array 를 만드는 방법 4 -> lambda 를 활용한 방법
    var a5 = Array(10, { 0 })
    var a6 = Array(5, { 1;2;3;4;5 })
}