package com.example.myapplication.Kotlin

// 08 제어흐름
// if , else

fun main() {
    val a: Int = 5
    val b: Int = 10

    //if/else 사용방법 1
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    //if/else 사용방법 2
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a == b) {
        println("a와 b는 같다")
    } else {

    }
    // 값을 리턴하는 if 사용방법
    val max = if (a > b) {
        a
    } else {
        b
    }// max 값에 if문 의 결과값이 들어감 (b가 a보타 큼으로 max에 10이 들어감)
    //값을 리턴하는 사용방법(2)
    val max1 = if (a > b) a else b

    println()
    println(max)
}