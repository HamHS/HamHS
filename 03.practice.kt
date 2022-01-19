package com.example.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = c.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// -존재 하지 않는다.

var abc : Int? = null
var abc1 : Double? = null

var g = a + 3

fun main(){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc)
    println(abc1)
    println(g)
}