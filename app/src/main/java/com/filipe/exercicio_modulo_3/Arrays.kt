package com.filipe.exercicio_modulo_3

class Arrays {
}

fun main() {
    var array: IntArray = IntArray(40)

    var num = 1

    for (i in 0..array.size - 2) {
        array[i] = i + num
        println(array[i])
    }
}






