package com.example.myapplication.Kotlin


fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부 함수
// 함수 안에 함수가 있다
fun showMyplus(first: Int, second: Int): Int {
    println(first)
    println(second)

    // return first +second
    fun plus(first: Int,second: Int):Int{
        return first+second
    }
    return plus(first,second)
}

fun main() {
    val result = plusThree(first = 1, second = 2, third = 3)
    println(result)
    val result2 = minusThree(first = 10, second = 1, third = 2)
    println(result2)
    val result3 = multiplyThree(first = 2, second = 2, third = 2)
    println(result3)
    val result4 = multiplyThree()
    println(result4)

    println()
    val result5 = showMyplus(4,5)
    println(result5)
}



