package com.br.digitalhouse.exc1

class Exercicio1 {
    val animais = arrayListOf(
        "Pato", "Cachorro", "Gato"
    )

    init {
        try {
            println("Pegando animal fora do index")
            animais.get(3)
        } catch(erro: IndexOutOfBoundsException){
            println("Exception pega")
        }
    }
}