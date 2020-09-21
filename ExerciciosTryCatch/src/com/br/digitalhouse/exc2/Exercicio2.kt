package com.br.digitalhouse.exc2

import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException

class Exercicio2 {
    var animais:MutableList<String>? = null
    init {
        try {
            animais!![2]

        }catch (erro: NullPointerException) {
            println("Erro de execeção de nulo.")
        }

        animais = mutableListOf()

        try {
            animais!![5]
        } catch(erro: IndexOutOfBoundsException) {
            println("Erro de exceção fora do index.")
        }
    }
}