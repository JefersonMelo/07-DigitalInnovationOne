package com.prospertec.collections.testes

fun main() {
    val valores = intArrayOf(325, 1, 34, 6, 9)

    valores.sort()
    valores.forEach {
        println(it)
    }
}