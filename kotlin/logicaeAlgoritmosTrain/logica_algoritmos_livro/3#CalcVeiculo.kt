package logica_algoritmos_livro

fun main(){

    //entradas
    print("Modelo do veiculo: ")
    val modelo = readln()


    print("Preço do veiculo: ")
    val preco = readln().toDouble()

    //processo
    val entrada = preco / 2
    val parcelas = entrada / 12


    //saidas
    println("Promoção: $modelo\nEntrada: $entrada")
    println("+12x de R$$parcelas")

}