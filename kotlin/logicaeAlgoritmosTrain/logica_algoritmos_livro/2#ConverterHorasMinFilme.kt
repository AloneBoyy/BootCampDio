package logica_algoritmos_livro

import java.awt.Color.red

fun main(){

    print("Filme: ")
    val filme = readln()

    print("Duração(Min): ")
    val duracao = readln().toInt()

    val conversor = duracao / 60


    val redColor = "\u001B[31m"
    val greenColor = "\u001B[32m"
    val yellowColor = "\u001B[33m"
    val resetColor = "\u001B[0m" // Reseta a cor para a padrão

    print("Você vai assistir ${redColor}${filme}")
    print(" e ele vai durar $conversor horas")
}