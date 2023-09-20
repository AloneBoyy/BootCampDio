package Abstração_Kotlin_Desafio

import java.util.InputMismatchException
import java.util.Scanner

class Bancaria1(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
    fun getNumeroConta(): Int {
        return numeroConta
    }

    fun getNomeTitular(): String {
        return nomeTitular
    }

    fun getSaldo(): Double {
        return saldo
    }
}

fun main() {
    val scanner = Scanner(System.
    `in`)

    val numeroConta = scanner.nextInt()
    scanner.nextLine()

    val nomeTitular = scanner.nextLine()

    val saldo = Scanner(System.`in`)
    try {
        val saldoDouble = saldo.nextDouble()
    }catch (e: InputMismatchException){
        println("Entrada inválida")
    }

    val contaBancaria1 = Bancaria1(numeroConta, nomeTitular, saldo.nextDouble())
    val cont1 = contaBancaria1.getNumeroConta()
    val nomet1 = contaBancaria1.getNomeTitular()
    val sald1 = contaBancaria1.getSaldo()

    println("Informacoes:")
    println(" Conta: $cont1\n" +
            "Titular: $nomet1\n" +
            "Saldo: $sald1")

    }
    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.


    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
