package com.example.myapplication.Kotlin

fun main() {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }


    if (b + c == 110) {
        println("b plus c equal 110")
    } else {
        println("b plus c is not 110")
    }
    // 엘비스 연산자
    // val 변수 : Int? = n
    // val 변수2 = 변수 ?: n2
    // 변수가 null 일때 n2를 변수에 넣음
    // null 이 아닐경우 n을 변수에 넣음
    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)


    val num1 : Int = 10
    val num2 : Int = 20

    val max = if ( num1 > num2){
        num1
    }else if (num1 == num2){
        num2
    }else{
        100
    }
}