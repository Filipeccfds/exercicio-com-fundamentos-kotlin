package com.filipe.exercicio_modulo_3

class Variaveis {
}

fun main() {

    var variavelMutavel:Int = 6
    variavelMutavel = 5
    println(variavelMutavel)

    val variavelImutavel = 6
    //variavelImutavel = 7
    println(variavelImutavel)

    //a variavelImutavel deu erro na execucação informando que: "val" nao pode ser
    //reatribuida ou seja a variavel "val" recebe o valor uma unica vez e nao e permitdo modifica-la

}