package com.smartherd.hazi_clean
/*
//package demo

import java.util.Random

fun main (args : Array<String>) {
    println("Hello World!")
    val name = "Tony"
    //var age = 25
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    println("Biggest Int : $bigInt, lowest Int: $smallInt")

    var letter: Char = 'A'
    println("A is a char : $letter is Char")

    val myName = "Tony Taylor"

    var str1 = "A random string"
    var str2 : String = "A random string"


    println("String equal: ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")

    var n : Int = 0
    println("n-edik char: ${str1[n]}")

    println("Index 2 - 7 : ${str1.substring(2,8)}")



    // Arrays

    var myArray = arrayOf(1, 1.23, "anything fits here")

    myArray[1] = 2.99
    println(myArray[1]);
    println("Array length: ${myArray.size}")
    println("First: ${myArray.first()}")

    var sqArray = Array(10, {x -> x * x})
    println(sqArray[9])

    var arr2: Array<Int> = arrayOf(1, 2, 3)


    // Lists

    var oneToTwelve = 1..12
    var alpha = "A".."Y"
    var twelveToOne =12.downTo(1)
    var twoTo20 = 2.rangeTo(20)
    var rng3 = oneToTwelve.step(3)

    for(x in rng3 ) println("rng3: $x")

    for(x in twelveToOne.reversed()) println("Reversed reverse: $x")


    // Conditionals
    // And: &&, Or: ||, Not: !, % modulo

    val age = 15;

    when (age) {
        0,1,2,3,4,5 -> println("Go to preschool");
        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }
        else -> println("Go to Collage")
    }

    for(x in 1..10) println("Loop : $x")

    val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    var guess = 0;

    while(magicNum != guess) {
        //println("Wrong guess, it's not $guess")
        guess++
    }
    println("Magic number was $guess")


    var arr3: Array<Int> = arrayOf(3,6,9)

    for (i in arr3.indices) {
        println("Mult 3 : ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()) {
        println("Index : $index Value: ${value + 1}")
    }

    // functions

    fun add(a: Int, b: Int) : Int = a + b
    println("5 + 4 = ${add(5,4)}")

    fun substract(a: Int = 1, b: Int = 1) = a - b
    println("5 - 4 = ${substract(5,4)}")
    println("4 - 5 = ${substract(b = 5, a = 4)}")

    fun sayhello(name: String) : Unit = println("Hello $name!")
    println("${sayhello("Tony")}")


    val (two, three) = nextTwo(1)
    println ("1, $two, $three")


    fun getSum(vararg nums: Int): Int {
        var sum = 0

        nums.forEach {n -> sum += n}

        return sum
    }
    println("Sum = ${getSum(1,2,3,4,5)}")



    val multiply = {a: Int, b: Int -> a * b}
    println("9 * 4 = ${9 * 4}")




    fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")


    fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
        for(num in numList) {
            println("MathOnList = ${myFunc(num)}")
        }
    }
    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)

    mathOnList(numList2, multiply2)


    // Lists
    val numList3 = 1..20

    val listSum = numList3.reduce{x, y -> x + y}
    println("Reduce Sum : $listSum")

    val listSum2 = numList3.fold(-10) { x, y -> x + y}
    println("Fold Sum : $listSum2")



    println("Evens : ${numList3.any {it % 2 == 0}  }")
    println("Evens : ${numList3.all {it % 2 == 0}  }")

    val big3 = numList3.filter {it > 3}
    big3.forEach {n -> println(">3 : $n")}

    /*
    var x = 1;
    val y = 3;

    x = y + 2
    y = x + 1
    println("x = $x y = $y")

     */





}

fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num + 1, num + 2)
}


 */