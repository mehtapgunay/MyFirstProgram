package com.example.helloworld

fun main(){
    //immutable variable
    //TODO: Add new functionality

    /*
    This is
    a multiline
    comment

     */

    //type string
    val myName= "Denis "
    //type int
    var myNumber= 12
    //type int 32 bit
    //type inference finds out the type from context
    var myAge = 12


    //Integer TYPES: Byte (8 bit), Short (16 bit),
    //Int (32 bit), Long (64 bit)
    val myByte: Byte =12
    val myShort: Short =125
    val myInt: Int =123123123
    val myLong: Long =39_812_309_487_120_394

    //Floating Point number Types: Float(32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.1415926535

    //Booleans he type Boolean is used to represent logical values.
    //It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar ='A'
    val digitChar = '$'

    //Strings
    val myStr = "Hello World"
    val firstCharInStr = myStr[0]
    var lastCharInStr=myStr[myStr.length -1]

    //print("First character  " + firstCharInStr)
    //print("Last character " + lastCharInStr)

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a= 5.0
    val b= 3
    var resultDouble: Double
    resultDouble = a / b
    //print(resultDouble)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    //println("isEqual is + $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${5>3}")
    println("is5LowerEqual3 ${5 <=3}" )
}


