package br.com.digitalhouse.exceptions.exercicio1

fun main() {
    val lista = mutableListOf<String>()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    //println("Terceiro elemento: ${lista.get(3)}")

    try {
        println("Terceiro elemento: ${lista.get(3)}")
    }catch (ex:Exception){
        println("Ocorreu uma exceção ${ex.message}")
    }



}