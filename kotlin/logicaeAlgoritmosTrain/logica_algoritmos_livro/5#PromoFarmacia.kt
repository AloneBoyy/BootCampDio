package logica_algoritmos_livro
import kotlin.math.floor

fun main(){

    //entrada
    print("Medicamento: ")
    val medicamento = readln()

    print("Preço: R$")
    val preco = readln().toDouble()

    //processos

    val promocao = (floor(preco)) * 2

    //saidas
    print("Na promoção levando dois $medicamento fica R$$promocao")
}