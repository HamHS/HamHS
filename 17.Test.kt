package com.example.myapplication.Kotlin


// 1번문제
// List를 두개 만든다
// 첫번쨰 List 에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False 값을 넣어준다

// 2번문제 학점을 구하자
// 80 - 90 -> a
// 70 - 19 -> b
// 60 - 69 -> c
// 나머지 f

// 3번문제
// 전달받은 숫자의 각자리 수의 합을 구하라
// 조건 : 전달받은 숫자는 무조건 두자릿수이다.

// 4번문제
// 구구단을 출력하자.

fun main(array: Array<String>) {
    first()
    println(second(80))
    println(third((89)))
    gugudan()
}

fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            //짝수
            list2[index] = true
        } else {
            //홀수
            list2[index] = false
        }
    }
    println(list2)
}

fun second(score: Int): String {
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}

fun third(number: Int): Int {
    //89 -> 8 + 9
    val a: Int = number / 10
    val b: Int = number % 10

    return a + b
}

fun gugudan() {
    for (x in 1..9) {
        // 1 -> 2
        for (y in 1..9) {
            // 1부터 9까지 반복 -> 1부터 9까지 반복
            println("$x x $y = ${x * y}")
        }
    }
}