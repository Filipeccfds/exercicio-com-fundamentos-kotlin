package com.filipe.exercicio_modulo_3

class condicionais {
}

fun main() {

    var numero = 223

    if ( numero % 2 == 0) {
        println("A variavel numero é PAR")
    } else {
        println("A variavel numero é IMPAR")
    }

    var numero2 = 24


    var resultado = when {
        numero2 %2 == 0 -> println("As variavel numero2 é PAR")
        else -> println("A variavel numero2 é IMPAR")
    }
}