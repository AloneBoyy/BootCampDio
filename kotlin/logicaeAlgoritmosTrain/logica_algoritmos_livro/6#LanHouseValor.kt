package logica_algoritmos_livro

fun main() {

    //entradas

    print("Valor a cada 15 minutos: R$")
    val valor15min = readln().toDouble()

    print("Você ultilizou por: ")
    val usoPorMinutos = readln().toDouble()

    //processos
    val tot = (usoPorMinutos / 15) * valor15min
    val minutosExtras = usoPorMinutos % 15

    //saidas
    println("Você vai pagar $tot")
}

//Corrigido ChatGPT

/*
* fun main() {
    // Lê o valor por 15 minutos de uso do computador
    print("Digite o valor por 15 minutos de uso do computador: ")
    val valorPor15Minutos = readLine()?.toDoubleOrNull() ?: 0.0

    // Lê o tempo de uso por um cliente em minutos
    print("Digite o tempo de uso por um cliente em minutos: ")
    val tempoDeUso = readLine()?.toIntOrNull() ?: 0

    // Calcula o valor a ser pago pelo cliente
    val valorTotal = calcularValorTotal(valorPor15Minutos, tempoDeUso)

    // Exibe o valor a ser pago pelo cliente
    println("O valor a ser pago pelo cliente é: R$$valorTotal")
}

fun calcularValorTotal(valorPor15Minutos: Double, tempoDeUso: Int): Double {
    // Calcula o número de períodos de 15 minutos completos
    val periodosCompletos = tempoDeUso / 15

    // Calcula o valor dos períodos completos
    val valorPeriodosCompletos = periodosCompletos * valorPor15Minutos

    // Calcula o valor das frações extras, se houver
    val minutosExtras = tempoDeUso % 15
    val valorExtras = if (minutosExtras > 0) valorPor15Minutos else 0.0

    // Calcula o valor total a ser pago
    val valorTotal = valorPeriodosCompletos + valorExtras

    return valorTotal
}
*/