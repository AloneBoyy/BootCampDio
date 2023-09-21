package logica_algoritmos_livro

fun main(){

    //entradas
    print("Buffer por kg: ")
    val kg = readln().toDouble()

    print("Consumo do cliente(gramas): ")
    val consumoEmgramas = readln().toDouble()

    //processos
    val preco = (kg/ 1000) * consumoEmgramas

    //saidas
    print("Valor total: R$$preco")
}