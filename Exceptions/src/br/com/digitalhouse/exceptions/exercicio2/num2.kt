package br.com.digitalhouse.exceptions.exercicio2

fun main() {
    try {
        var lista: MutableList<String>? = null

        lista?.add("Pato")
        lista?.add("Cachorro")
        lista?.add("Gato")
        lista?.add("Elefante")
        lista?.add("Girafa")
        lista?.add("Borboleta")

        println(lista)
        println("Conteudo da prosição 2: ${lista!!.get(2)}")
    }catch (ex:Exception){
        println("Exceção: ${ex.message} ,resultado nao foi encontrado")
    }

}
