package com.filipe.exercicio_modulo_3

fun main() {
    val n = 99
    var lista: MutableList<Int> = MutableList(n) {0}


    var soma = 0
    for (i in lista.indices){
        lista[i] = i + 1
        println(lista[i])
        soma+= i
    }
        println(soma)
}
