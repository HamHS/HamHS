package com.example.myapplication.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> char
// 문자열 -> String
// 논리형(참/거짓) -> Boolean

//변수 선언하는 방법(1)
// Variable/Value 변수명 = 값
// var/val 변수명 = 값
var number = 10

//변수 선언하는 방법(2)
// var/val 변수 : 자료형 = 값
var number1: Int = 20
var hello1: String = "hello"
var point1:Double = 3.4

// Variable or value ?
// 1. 변하지 않는 값이라면 Value
// 2. 잘 모르겠는 경우 -> Value

fun main(){
    println(number)
    println(number1)
    println(hello1)
    println(point1)
}